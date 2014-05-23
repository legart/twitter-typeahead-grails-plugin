import grails.util.Environment

boolean dev = Environment.isDevelopmentMode()

def pluginManager = grails.util.Holders.pluginManager

def jqueryPlugin = pluginManager.getGrailsPlugin('jquery')

def jsFile = "typeahead.js"
def jsminFile = "typeahead.min.js"

modules = {
    'typeahead-js' {
        if (jqueryPlugin) {
            dependsOn "jquery"
        }

        resource id: 'typeahead-js', url:[plugin: 'twitter-typeahead', dir: 'js', file: (dev ? jsFile : jsminFile)]
    }

    'typeahead-bootstrap-css' {
        resource id: 'typeahead-bootstrap-css', url: [plugin: 'twitter-typeahead', dir: 'css', file: 'typeahead.js-bootstrap.css'], disposition: 'head'
    }
}
