package org.za.blog.service;

import org.za.blog.entity.Account;

public interface IAccountService {

    /**
     *
     * @param UserName
     * @param Password
     * @return 对应Account如果当密码正确，否则，返回null
     */
    Account login(String UserName, String Password);

    Account getOneUserByUsername(String UserName);

}
