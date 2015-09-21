(ns jobless-clj.core
  (:gen-class)
  (:require
   [selmer.parser :as selmer]))

(defn cv [& args]
  (let [groups {:groups (map :group (filter #(some? (:group %1)) args))}
        others (into {} (remove #(some? (:group %1)) args))]
    (selmer/render-file "template.html" (merge others groups))))

(defmacro cv-item [item] 
  `(defn ~(symbol item) [arg#] {~(keyword item) arg#}))

(defmacro cv-group [group-type group-name]
  `(defn ~(symbol group-type) [& args#] 
     (let [items# (map :entry (filter #(some? (:entry %1)) args#))]
       {:group {:items items# :type ~group-type :name ~group-name}})))


(cv-group "employment" "Employment")
(cv-group "education" "Education")
(cv-group "open-source" "Open Source")
(cv-group "other-exp" "Other Experience")

(cv-item "cv-name")
(cv-item "technologies")
(cv-item "homepage")
(cv-item "email")
(cv-item "title")
(cv-item "bulletin")
(cv-item "email")
(cv-item "location")
(cv-item "address")
(cv-item "start-date")
(cv-item "end-date")
(cv-item "company")
(cv-item "description")

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
