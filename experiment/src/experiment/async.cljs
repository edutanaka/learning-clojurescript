(ns experiment.async
  (:require [cljs.core.async :as async])
  (:require-macros [cljs.core.async.macros :as async-macros]))

(def channel (async/chan 5))

(defn enqueue-val
  [v]
  (async-macros/go (async/>! channel v)))

(defn retrieve-val
  []
  (async-macros/go
    (js/console.log (async/<! channel))))

(defn enqueue-and-retrieve
  [v]
  (enqueue-val v)
  (retrieve-val))

(defn listen
  []
  (async-macros/go
    (while true
      (js/console.log (async/<! channel)))))
