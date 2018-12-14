(ns project-manager.workspaces
  (:require
    [nubank.workspaces.core :as ws]
    [project-manager.demo-ws]))

(defonce init (ws/mount))
