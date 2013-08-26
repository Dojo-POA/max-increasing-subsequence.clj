(ns dojo-functional.core
  (:gen-class))

(defn one-element-list? [sqnc]
  (= nil (second sqnc))
)



(defn longest-list [x1 x2]
  (if (>= (count x1) (count x2)) x1 x2)
)

(defn list-without-second [sqnc]
  (cons (first sqnc) (nthrest sqnc 2))
)

(defn find-increasing-sequence [sqnc] 
  (defn with-at-least-two-elements [sqnc] 
    (def the-first (first sqnc))
    (if (> the-first (second sqnc))
      (find-increasing-sequence (list-without-second sqnc))
      (cons the-first (find-increasing-sequence (rest sqnc)))
    )
  )
  (defn from-first-element [sqnc]
    (if (one-element-list? sqnc)
      sqnc
      (with-at-least-two-elements sqnc)    
    )
  )
  (if (empty? sqnc)
    sqnc
    (longest-list 
      (from-first-element sqnc)
      (find-increasing-sequence (rest sqnc))
    )
  )  
)



