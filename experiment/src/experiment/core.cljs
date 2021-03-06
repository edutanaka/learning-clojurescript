(ns experiment.core
  (:require [experiment.utils :refer [adder]]
            [experiment.consumers :as consumers]
            [experiment.async]))

(defn adder-multiplier
  [x y z]
  (* z (adder x y)))

(enable-console-print!)

(println "This text is printed from src/experiment/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
