package org.apache.catalina.realm;

import java.security.cert.X509Certificate;

public abstract interface X509UsernameRetriever
{
  public abstract String getUsername(X509Certificate paramX509Certificate);
}


/* Location:              D:\F\阿里云架构开发\taobao-tomcat-7.0.59\taobao-tomcat-7.0.59\lib\catalina.jar!\org\apache\catalina\realm\X509UsernameRetriever.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */