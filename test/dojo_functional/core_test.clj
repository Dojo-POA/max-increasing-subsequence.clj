(ns dojo-functional.core-test
  (:require [clojure.test :refer :all]
            [dojo-functional.core :refer :all]))

(deftest find-increasing-sequence-test
  (testing "find sequence (1 2 3) inside (1 2 3)"
    (is 
      (= 
          (find-increasing-sequence (list 1 2 3)) (list 1 2 3)
      )
    )
  )
  
  (testing "is empty"
    (is 
      (empty?   
          (find-increasing-sequence [] ) 
      )
    )
  )
  
  (testing "find sequence (2) inside (2 1)"
    (is 
      (=   
          (find-increasing-sequence (list 2 1)) (list 2)
      ) 
    )
  )
  (testing "find sequence (2 3) inside (2 3 1)"
    (is 
      (=   
          (find-increasing-sequence (list 2 3 1)) (list 2 3)
      ) 
    )
  )
)
    
  
