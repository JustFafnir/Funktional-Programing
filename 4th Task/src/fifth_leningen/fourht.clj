(require '[clojure.string :as str])
(use 'clojure.test)

(defn average [collection]
  (float (/ (reduce + collection) (count collection))))

(defn avg_mrk [students]
  (average (for [[a b] (filter (fn [[c d]] (str/ends-with? c "a")) students)] b))
  )
(def students {"Inese" 10 "Vasja" 8 "Petja" 4 "Natasha" 7 "Anja" 10 "Lauris" 6 "Sandra" 8 "Krišjanis" 9})
(is (= 8 (avg_mrk students)))

(print "TEST: \n")
(is (= 10.0 (avg_mrk {"Anja" 10})))
(is (= 10.0 (avg_mrk {"Anja" 10 "Lauris" 5})))
(is (= 9.5 (avg_mrk {"Anja" 10 "Lauris" 5 "Sandra" 9})))
(is (= 7.25 (avg_mrk {"Vasja" 8 "Petja" 4 "Natasha" 7 "Anja" 10})))
