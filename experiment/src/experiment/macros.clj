(ns experiment.macros)

(defmacro increment
  "Given a form, increment it by 1 and return"
  [x]
  `(+ 1 ~x))

(defmacro printer-macro
  "Given a form, increment it by 1 and return"
  [x]
  (println x))

(defmacro fnswap
  "Replace the form in the calling position of body with the function f, evaluate and return."
  [f body]
  `(~f ~@(rest body)))
