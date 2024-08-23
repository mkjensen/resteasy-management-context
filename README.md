# resteasy-management-context

`org.jboss.resteasy.plugins.spring.SpringBeanProcessor.onApplicationEvent` is called for both the management context and
the normal context.

However, the registered resources are only available at the normal server port (as expected).
