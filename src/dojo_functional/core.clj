(ns dojo-functional.core
  (:gen-class))

(defn one-element-list? [sqnc]
  (= nil (second sqnc))
)

(defn find-increasing-sequence-from-first-element [sqnc] 
  (if (one-element-list? sqnc)
    sqnc
    (if 
      (> (first sqnc) (second sqnc))
      (list (first sqnc))
      (cons (first sqnc) (find-increasing-sequence-from-first-element (rest sqnc)))
    )    
  )
)

(defn max-list [x1 x2]
  (if 
    (>= (count x1) (count x2))
    x1
    x2
  )
)

(defn find-increasing-sequence [sqnc] 
  (if (empty? sqnc)
   (find-increasing-sequence-from-first-element sqnc)
    (max-list 
      (find-increasing-sequence-from-first-element sqnc)
      (find-increasing-sequence (rest sqnc))
      )
  )
  
)