(defproject stemmers-compared "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[clj-fuzzy "0.2.1"]
                 [org.apache.lucene/lucene-analyzers-common  "4.2.0"]
                 [org.apache.lucene/lucene-core  "4.2.0"]]
  :plugins [[lein-gorilla "0.3.4"]]
  :main core)
