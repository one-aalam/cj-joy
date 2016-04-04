(defproject cj-joy "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40"]
                 [figwheel "0.5.2"]]
                 
  :jvm-opts ["-Xmx1G"]
  
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.2"]]
            
  :figwheel {
              :http-server-root "public"
              :server-port 3449
              :css-dirs ["resources/public/css"]}
            
  :cljsbuild {
      :builds [{:id "dev"
                ; The path to the top-level ClojureScript source directory
                :source-paths ["src/cj_joy"]
                ; The standard ClojureScript compiler options
                :figwheel true
                ;    
                :compiler {
                    :output-to "resources/public/cj_joy.js"
                    :output-dir "resources/public/out"
                    :optimizations :none
                    :source-map true
                    :pretty-print true  
                }
      }]})
  
  
