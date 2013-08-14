def dev = grails.util.GrailsUtil.isDevelopmentEnv()

def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

def jsFile = "typeahead.js"
def jsminFile = "typeahead.min.js"

modules = {
    'typeahead-js' {
        if (jqueryPlugin) {
            dependsOn "jquery"
        }

        resource id: 'typeahead-js', url:[plugin: 'twitter-typeahead', dir: 'js', (dev ? jsFile : jsminFile)]
    }

    'typeahead-bootstrap-css' {
        resource id: 'typeahead-bootstrap-css', url: [plugin: 'twitter-typeahead', dir: 'css', file: 'typeahead.js-bootstrap.css'], disposition: 'head'
    }
}
