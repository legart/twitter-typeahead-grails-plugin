class TwitterTypeaheadGrailsPlugin {
    // the plugin version
    def version = "0.9.3"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Twitter Typeahead resources" // Headline display name of the plugin
    def author = "Michael Legart"
    def authorEmail = "ml@code3.dk"
    def description = '''\
Provides resource files the Twitter Typeahead library
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/legart/twitter-typeahead-grails-plugin/blob/master/README.md"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Michael Legart", email: "ml@code3.dk" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "github", url: "https://github.com/legart/twitter-typeahead-grails-plugin/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/legart/twitter-typeahead-grails-plugin" ]
}
