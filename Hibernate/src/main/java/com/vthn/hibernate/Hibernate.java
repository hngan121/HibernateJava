/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vthn.hibernate;

import com.mysql.cj.xdevapi.Session;
import com.vthn.pojo.Category;
import static java.time.Clock.system;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author admin
 */
public class Hibernate {

    public static void main(String[] args) {
        try (Session session = HibernateUntils.getFactory().openSession()) {
        Query q = session.createQuer("FROM Category");
        List<Category> cates = q.getResultList();
        cates.forEach(p-> system.out.println(p.getName()));
    }
}
