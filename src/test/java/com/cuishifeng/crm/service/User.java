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

import com.cuishifeng.crm.annotation.Column;
import com.cuishifeng.crm.annotation.Id;
import com.cuishifeng.crm.annotation.Table;

/**
 * @author cuishifeng <cuishifeng@kuaishou.com>
 * Created on 2022-07-12
 */
@Table(name = "user")
public class User extends SQLTemplate<User> {

    @Id
    private long id;
    private String name;

    @Column(name = "name_id")
    private String order_id_name;

    public String getOrder_id_name() {
        return order_id_name;
    }

    public void setOrder_id_name(String order_id_name) {
        this.order_id_name = order_id_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
