Grails plugin: Twitter Typeahead resource files
===============================================

Provides resource files for Twitter Typehead.

See https://github.com/twitter/typeahead.js to get started.

Including the resources
------------------------

You can use either the resources or Asset-Pipeline plugins to use
this plugin.

If you use the Grails resources plugin the following resources are exposed:

    typeahead-js               - The typeahead javascript
    typeahead-bootstrap-css    - CSS to theme typeahead for usage with Bootstrap 

To use Asset-Pipeline add the following to your Javascript code:

```javascript
//= require typeahead

console.log("My javascript goes here");
```

Usage
-----

Declare bootstrap resource module in GSP page header:

    <r:require modules="typeahead-js"/>

Copyright and License
---------------------

twitter-typeahead plugin:

   Copyright 2013 Michael Legart 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.


Twitter Typeahead JS and CSS files:

    Copyright 2013 Twitter, Inc.

    Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law

