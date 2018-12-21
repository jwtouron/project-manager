(ns project-manager.workspaces
  (:require
    [nubank.workspaces.core :as ws]
    [project-manager.demo-ws]
    [project-manager.project]))

(defonce init (ws/mount))
