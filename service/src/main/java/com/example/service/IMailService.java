package com.example.service;

import com.example.bean.Email;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
public interface IMailService {
    /**
     * 简单文本邮件
     * @param mail
     * @throws Exception
     */
    void sendSimpleMail(Email mail) throws Exception;

    /**
     * html邮件
     * @param mail
     * @throws Exception
     */
    void sendHtml(Email mail) throws Exception;

    /**
     * 附件邮件
     * @param email
     * @throws Exception
     */
    void sendAttachmentsMail(Email email) throws  Exception;

    /**
     * 静态邮件
     * @param email
     * @throws Exception
     */
    void sendInlineMail(Email email)throws Exception;
}
