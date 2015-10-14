(defproject jobless-clj "0.1.1"
  :description "A simple dsl for creating cvs."
  :url "https://github.com/jbristow/jobless-clj"
  :scm {:name "git"
        :url "https://github.com/jbristow/jobless-clj"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :signing {:gpg-key "jbristow@gmail.com"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [selmer "0.9.2"]]
  :plugins [[lein-cljfmt "0.1.10"]]
  :main ^:skip-aot jobless-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
