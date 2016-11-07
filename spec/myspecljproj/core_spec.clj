(ns myspecljproj.core-spec
  (:require [speclj.core :refer :all]
            [myspecljproj.core :refer :all]))

(describe "a test"
  (it "FIXME, I fail."
    (should= 1 1))
  (it " one plus one is two"
   (should= 2 (+ 1 1))))

(describe "some more math test"
  (it "Four times 2 is 8"
  (should= 8 (* 4 2))))


(describe "Vector"
  (it "gets the first element"
  (should= 9 (first [9 8 7 6])))
)

(describe "Strings"
  (it "concats string"
  (should= "I love clojure" (str "I" " love" " clojure"))))

(describe "Control flow"
(it "if true the first condition is executed"
  (should= "yes true" (if true "yes true" "no false")))
(it "if false second condition is executed"
  (should= "no false" (if false "yes true" "no false"))))
