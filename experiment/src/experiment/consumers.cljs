(ns experiment.consumers
  (:require-macros [experiment.macros :as m]))

(defn printer-func
  [x]
  (println x))

(defn increment-func
  "Increment y by 1"
  [y]
  (m/increment y))
