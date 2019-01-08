package com.cr.proxy.staticProxy;

import com.cr.proxy.Subject;
import com.cr.proxy.SubjectImpl;

public class Client {

    public static void main(String[] args) {
        Subject proxy = new Proxy(new SubjectImpl());
        proxy.request();
    }

}
