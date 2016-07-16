(require 'cljs.build.api)
(cljs.build.api/watch "src" {:main 'cljs-first-project.core
                             :output-to "out/main.js"})

