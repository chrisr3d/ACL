LESQUOY Baptiste

STUDER Christian

WEISSENBACH Nicolas


Il y a quelques problemes avec le plugin objectAid : le lien d'héritage n'apparait pas entre "Character" et "Playable".

#Utilisation des scripts Ant:

runProject
	la target "init" sert a initialiser les variables de chemins vers les differents dossier du projets (bin/, src/)
	la target "clean" supprime le dossier bin/ pour etre etre sur que tous les fichiers sources sont bien recompilés
	la target "prepare" creer le dossier bin/
	la target "compile" sert a compiler les sources dans le dossier bin/
	la target "execute" execute le programme. C'est cette target qui est appelé en premier par le script, avant son execution, elle effectue d'abord toutes les autre targets
	
	pour executer ce script depuis un terminal:
		ant -buildfile runProject.xml
		
runTests
	les targets "clean", "prepare", "compile" idem que runProject
	la target "junit" execute tous les tests contenu dans le dossier tests/
	la target "main" est la target principal, c'est elle qui execute recursivement toutes les autre target
	
	pour executer ce script depuis un terminal:
		ant -buildfile runTests.xml
		
#Fonctionnalités implémentées:
	-déplacement du personnage
	-les objets du jeu sont représentés par des Sprites
	-collisions des personnages contre les murs
