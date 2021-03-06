package org.apache.catalina.startup;

import org.apache.catalina.deploy.ContextHandler;
import org.apache.tomcat.util.digester.Digester;
import org.apache.tomcat.util.digester.Rule;

final class SoapHeaderRule
  extends Rule
{
  public SoapHeaderRule() {}
  
  public void body(String namespace, String name, String text)
    throws Exception
  {
    String namespaceuri = null;
    String localpart = text;
    int colon = text.indexOf(':');
    if (colon >= 0)
    {
      String prefix = text.substring(0, colon);
      namespaceuri = this.digester.findNamespaceURI(prefix);
      localpart = text.substring(colon + 1);
    }
    ContextHandler contextHandler = (ContextHandler)this.digester.peek();
    contextHandler.addSoapHeaders(localpart, namespaceuri);
  }
}


/* Location:              D:\F\阿里云架构开发\taobao-tomcat-7.0.59\taobao-tomcat-7.0.59\lib\catalina.jar!\org\apache\catalina\startup\SoapHeaderRule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */