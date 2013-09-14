(ns drake-interface.core
  (:refer-clojure :exclude [file-seq]))

(defprotocol Protocol
  (cmds-required? [this])
  (run [this step]))

(defprotocol FileSystem
  (exists? [_ path])
  (directory? [_ path])
  (mod-time [_ path])
  (file-seq [_ path])
  (file-info [_ path])
  (file-info-seq [_ path])
  (data-in? [_ path])
  (normalized-filename [_ path])
  (rm [_ path])
  (mv [_ from to]))
