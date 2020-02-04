package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("123X0");
        Product product = new Product("Watch");
        Item itemOne = new Item(new BigDecimal(202020),2,new BigDecimal(303030));
        Item itemTwo = new Item(new BigDecimal(1010101),3,new BigDecimal(404040));
       product.getItems().add(itemOne);
       product.getItems().add(itemTwo);
       invoice.getItems().add(itemOne);
       invoice.getItems().add(itemTwo);
        itemOne.setInvoice(invoice);
        itemTwo.setInvoice(invoice);
        itemOne.setProduct(product);
        itemTwo.setProduct(product);


        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        productDao.save(product);
        int productId = product.getId();


        //Than
        Assert.assertNotEquals(0,invoiceId);
        Assert.assertNotEquals(0,productId);

        //Clean
        invoiceDao.deleteById(invoiceId);
        productDao.deleteById(productId);

    }
}
