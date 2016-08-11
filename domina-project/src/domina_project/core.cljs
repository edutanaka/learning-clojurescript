(ns domina-project.core
  (:require [domina :as dom]
            [domina.css :as css]
            [domina.events :as events]))

(enable-console-print!)

(def the-div (css/sel "#a-div"))
(def the-href (dom/html-to-dom "<a></a>"))
(def the-btn (dom/html-to-dom "<button></button>"))

(defn add-dom-elts!
  []
  
  (doto the-href
    (dom/set-text! "wikipedia")
    (dom/set-attr! :href "http://en.wikipedia.org"))
  
  (dom/append! the-div the-href)
  
  (doto the-btn
    (dom/set-text! "click me!")
    (dom/set-attr! :type "button"))
  (events/listen!
   the-btn :click
   (fn [evt]
     (let [my-name (-> evt events/current-target dom/text)]
       (js/alert (str "hello world! from : " my-name)))))
  (dom/append! the-div the-btn))


