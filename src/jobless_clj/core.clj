(ns jobless-clj.core
  (:gen-class)
  (:require
   [selmer.parser :as selmer]))

(def default-css (slurp "resources/style.css"))

(defn cv [& args]
  (let [groups {:groups (map :group (filter #(some? (:group %1)) args))}
        others (into {} (remove #(some? (:group %1)) args))]
    (selmer/render-file "template.html" (merge {:css default-css} others groups))))

(defmacro cv-item [item] 
  `(defn ~(symbol item) [arg#] {~(keyword item) arg#}))

(defmacro cv-items [& items]
  `(do ~@(for [n items] `(cv-item ~n))))

(defmacro cv-group [group-type group-name]
  `(defn ~(symbol group-type) [& args#] 
     (let [items# (map :entry (filter #(some? (:entry %1)) args#))]
       {:group {:items items# :type ~group-type :name ~group-name}})))

(defmacro cv-groups [& groups]
  `(do ~@(for [n groups] `(cv-group ~(first n) ~(second n)))))

(cv-items "address" "bulletin" "company" "css" "cv-name" "description" "email" "email" 
          "end-date" "homepage" "location" "start-date" "technologies" "title")

(cv-groups ["employment" "Employment"]
           ["education" "Education"]
           ["open-source" "Open Source Projects"]
           ["other-exp" "Other Experience"])

(defn entry [& args]
  (let [bulletins (map :bulletin (filter #(some? (:bulletin %1)) args))
        others (into {} (remove #(some? (:bulletin %1)) args))]
    (if (zero? (count bulletins)) 
      {:entry others}
      {:entry (merge others {:bulletins bulletins})})))

(defn -main
  "Simple example"
  [& args]
  (do 
    (println "Outputting example cv to 'cv.html'.")
    (spit "cv.html"
          (cv 
           (cv-name "John Doe")
           (email "john.doe@gmail.com")
           (employment
            (entry
             (title "Full-stack Clojure Developer")
             (company "Democratic Programming Guard")
             (start-date "April 2015")
             (end-date "June 2015"))
            (entry 
             (title "C# Developer") 
             (company "Microsoft")
             (start-date "January 2015")
             (end-date "April 2015")))))))
