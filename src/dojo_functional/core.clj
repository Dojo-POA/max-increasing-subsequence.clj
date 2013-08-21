(ns dojo-functional.core
  (:gen-class))

(defn one-element-list? [sqnc]
  (= nil (second sqnc))
)

(defn find-increasing-sequence [sqnc] 
  (if (one-element-list? sqnc)
    sqnc
    (if 
      (> (first sqnc) (second sqnc))
      (list (first sqnc))
      (cons (first sqnc) (find-increasing-sequence (rest sqnc)))
    )    
  )
)
