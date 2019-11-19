package com.ac.springboot.service;

/**
 * @Description: 邮件发送SERVICE
 * @author: zhangyadong
 * @Date: 2019/11/19 0019 上午 10:31
 * @version: V1.0
 */
public interface MailService {

    /**
     * @Description 发送文本邮件
     * @params [to, subject, content]
     * @return void
     * @author zhangyadong
     * @date 2019/11/19 0019 上午 10:36
     */
    public void sendSimpleMail(String to, String subject, String content);

    /**
     * @Description 发送html邮件
     * @params [to, subject, content]
     * @return void
     * @author zhangyadong
     * @date 2019/11/19 0019 上午 10:36
     */
    public void sendHtmlMail(String to, String subject, String content);

    /**
     * @Description 发送带附件的邮件
     * @params [to, subject, content, filePath]
     * @return void
     * @author zhangyadong
     * @date 2019/11/19 0019 上午 10:37
     */
    public void sendAttachmentsMail(String to, String subject, String content, String filePath);

    /**
     * @Description 发送正文中有静态资源（图片）的邮件
     * @params [to, subject, content, rscPath, rscId]
     * @return void
     * @author zhangyadong
     * @date 2019/11/19 0019 上午 10:39
     */
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
