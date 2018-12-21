(ns project-manager.project
  (:require [fulcro.client.primitives :as fp :refer [defsc]]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcro.client.mutations :as fm]))


(defsc NewProjectForm [_ _]
  {:query []}
  (dom/div {:className "container"}
    (dom/h3 {:className "title is-3"} "Create New Project")
    (dom/div {:className "field"}
      (dom/label {:className "label"} "Name")
      (dom/input {:className "input" :type "text" :placeholder "Project Name"}))
    (dom/div {:className "field"}
      (dom/label {:className "label"} "Misc Info")
      (dom/textarea {:className "textarea":placeholder "Misc info here"}))
    (dom/div {:className "buttons" :style {:textAlign "right" :width "100%" :display "table"}}
      (dom/button {:className "button is-rounded is-success" :style {:width "100px"} :disabled true} "Ok")
      (dom/button {:className "button is-rounded is-danger" :style {:width "100px"}} "Cancel"))))


(ws/defcard new-project-form-card
  (ct.fulcro/fulcro-card
    {::f.portal/root NewProjectForm}))

;; (fp/defsc Test
;;   [this _]
;;   {:ident (fn [] [::id "singleton"])
;;    :query []}
;;   #_{:initial-state (fn [_] {:counter 0})
;;    :ident         (fn [] [::id "singleton"])
;;    :query         [:counter]}
;;   (dom/div "Test"))

;; (ws/defcard test-card
;;   (ct.fulcro/fulcro-card
;;     {::f.portal/root Test}))
