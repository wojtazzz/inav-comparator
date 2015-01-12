import groovy.servlet.GroovyServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler


def startJetty() {


    def context = new ServletContextHandler(ServletContextHandler.SESSIONS)
    context.with {
        contextPath = '/'
        resourceBase = 'src/main/webapp'
        addServlet(GroovyServlet, '*.groovy')
        setAttribute('version','1.0')
    }

    def server = new Server(8091)
    server.with {
        setHandler(context)
        start()
    }
}


println " starting jetty"
startJetty()


