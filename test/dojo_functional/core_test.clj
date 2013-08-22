(ns dojo-functional.core-test
  (:require [clojure.test :refer :all]
            [dojo-functional.core :refer :all]))

(deftest find-increasing-sequence-test  
  (testing "is empty"
    (is (empty? (find-increasing-sequence [] )))
  )
  
  (testing "find increasing sequence"
    (is (= (find-increasing-sequence (list 1)) (list 1)))
    (is (= (find-increasing-sequence (list 2 1)) (list 2)))
    (is (= (find-increasing-sequence (list 1 2 3)) (list 1 2 3)))
    (is (= (find-increasing-sequence (list 2 3 1)) (list 2 3)))
    (is (= (find-increasing-sequence (list 3 1 2 4)) (list 1 2 4)))
    (is (= (find-increasing-sequence (list 3 4 1 9 8 7)) (list 3 4 9)))
      (is (= (find-increasing-sequence (list 1 8 2 3 )) (list 1 2 3)))
    ;(is (= (find-increasing-sequence (list 3 1 6 5 2 4 7)) (list 1 2 4 7)))
  )
)
    
  
