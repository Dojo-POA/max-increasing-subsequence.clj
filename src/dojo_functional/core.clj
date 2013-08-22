(ns dojo-functional.core
  (:gen-class))

(defn one-element-list? [sqnc]
  (= nil (second sqnc))
)

(defn find-increasing-sequence-from-first-element [sqnc, the-longest-list] 
  (if (one-element-list? sqnc)
    sqnc
    (if (> (first sqnc) (second sqnc))
      (the-longest-list 
        (cons (first sqnc) (rest (rest sqnc)))
      )
      (cons (first sqnc) (the-longest-list (rest sqnc)))
    )    
  )
)

(defn longest-list [x1 x2]
  (if (>= (count x1) (count x2)) x1 x2)
)

(defn find-increasing-sequence [sqnc] 
  (if (empty? sqnc)
   sqnc
   (longest-list 
    (find-increasing-sequence-from-first-element sqnc find-increasing-sequence)
    (find-increasing-sequence (rest sqnc))
   )
  )  
)



