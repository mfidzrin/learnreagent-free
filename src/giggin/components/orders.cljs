(ns giggin.components.orders
  (:require [giggin.state :as state]))

(defn orders
  []
  [:aside 
   [:div.order
    [:div.body
    (for [[id qty] @state/orders]
      [:div.item {:key id}
       [:div.img 
        [:img {:src (:img (id @state/gigs))
               :alt (:title (id @state/gigs))}]]
       [:div.content
        [:p.title (str (:title (id @state/gigs)) " \u00D7 " qty)]]
       [:div.action 
        [:div.price (* (:price (id @state/gigs)) qty)]]])]]])