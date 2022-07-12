/*
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.cuishifeng.crm.service;


import org.junit.Assert;
import org.junit.Test;

import com.cuishifeng.crm.DaoHelper;
import com.cuishifeng.crm.SimpleDAOHelper;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author cuishifeng <cuishifeng@kuaishou.com>
 * Created on 2022-07-12
 */
public class TableDaoServiceTest {


    @Test
    public void testGetTableName() {
        User user = new User();
        System.out.println(user.tableEntityClass);
        Assert.assertEquals("user", user.getTableName());
    }

    @Test
    public void testSaveOne() throws Exception {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/db0");
        config.setUsername("root");
        config.setPassword("123456");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        HikariDataSource ds = new HikariDataSource(config);
        System.out.println(ds.isRunning());
        SimpleDAOHelper simpleDAOHelper = (SimpleDAOHelper) DaoHelper.createInstance(ds);
        User user = new User();
        user.setName("hello");
        Object result = user.saveOne(user);
        System.out.println(result);
    }

}