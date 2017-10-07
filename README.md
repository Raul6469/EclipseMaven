# EclipseMaven

[![Build Status](https://travis-ci.org/Raul6469/EclipseMaven.svg?branch=master)](https://travis-ci.org/Raul6469/EclipseMaven)
[![codecov](https://codecov.io/gh/Raul6469/EclipseMaven/branch/master/graph/badge.svg)](https://codecov.io/gh/Raul6469/EclipseMaven)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/aabd61d290044d0e92403a4edaa21226)](https://www.codacy.com/app/vb4007/EclipseMaven?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Raul6469/EclipseMaven&amp;utm_campaign=Badge_Grade)

Exemple d'intégration d'un projet Eclipse + Maven testé avec JUnit, et intégré avec Travis CI, Codecov et Codacy

## Installation
1. Cloner ce repo dans n'importe quel dossier
2. Ouvrir Eclipse
3. Dans `File > Import`, aller dans `Maven > Existing Maven Projects`
4. Localiser le dossier cloné

Vérifier que la classe `App.java` s'exécute en faisant clic-droit `Run As : Java Application`.

De même pour les classes de test.

## CI
A push, Travis compile et teste le programme, et envoie le rapport de couverture JaCoCo à Codecov, qui vérifie que les nouvelles fonctions sont testées et que les autres couvertures ne sont pas supprimées.

Codacy est un outil d'analyse de code statique qui donne des commentaires généraux sur le code, et peut être paramétré pour vérifier l'écriture de la Javadoc par exemple.
