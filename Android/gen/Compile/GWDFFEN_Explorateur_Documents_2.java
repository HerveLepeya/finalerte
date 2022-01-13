/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Explorateur_Documents_2
 * Date : 24/10/2021 18:20:32
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.core.parcours.champ.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Explorateur_Documents_2 extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Explorateur_Documents_2
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_DossiersFichiers
 */
class GWDZR_DossiersFichiers extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Documents_2.ZR_DossiersFichiers
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_CheminComplet
 */
class GWDATT_CheminComplet extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Documents_2.ZR_DossiersFichiers.ATT_CheminComplet
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_CheminComplet");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Explorateur_Documents_2.ZR_DossiersFichiers.ATT_CheminComplet

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_CheminComplet mWD_ATT_CheminComplet = new GWDATT_CheminComplet();

/**
 * ATT_Selection
 */
class GWDATT_Selection extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Explorateur_Documents_2.ZR_DossiersFichiers.ATT_Selection
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Selection");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Explorateur_Documents_2.ZR_DossiersFichiers.ATT_Selection

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Selection mWD_ATT_Selection = new GWDATT_Selection();

/**
 * ATT_Type
 */
class GWDATT_Type extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Explorateur_Documents_2.ZR_DossiersFichiers.ATT_Type
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Type");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Explorateur_Documents_2.ZR_DossiersFichiers.ATT_Type

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Type mWD_ATT_Type = new GWDATT_Type();

/**
 * IMG_Logo
 */
class GWDIMG_Logo extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Explorateur_Documents_2.ZR_DossiersFichiers.IMG_Logo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410778646770302241l);

super.setChecksum("709630409");

super.setNom("IMG_Logo");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(4, 6);

super.setTailleInitiale(95, 45);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\dossier@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(true);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xB8B2AC, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Logo mWD_IMG_Logo = new GWDIMG_Logo();

/**
 * LIB_Nom
 */
class GWDLIB_Nom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Explorateur_Documents_2.ZR_DossiersFichiers.LIB_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410778646770367777l);

super.setChecksum("709693665");

super.setNom("LIB_Nom");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("1");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(4, 59);

super.setTailleInitiale(95, 28);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setEllipse(32768);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xB8B2AC, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x816536, 0x10000, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Nom mWD_LIB_Nom = new GWDLIB_Nom();
/**
 * Initialise tous les champs de FEN_Explorateur_Documents_2.ZR_DossiersFichiers
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Explorateur_Documents_2.ZR_DossiersFichiers
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_CheminComplet.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_CheminComplet);
mWD_ATT_Selection.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Selection);
mWD_ATT_Type.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Type);
mWD_IMG_Logo.initialiserObjet();
super.ajouterChamp("IMG_Logo",mWD_IMG_Logo);
mWD_LIB_Nom.initialiserObjet();
super.ajouterChamp("LIB_Nom",mWD_LIB_Nom);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,106,92);
super.setQuid(2410778646770040097l);

super.setChecksum("709378297");

super.setNom("ZR_DossiersFichiers");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 406);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 3, 106, 92);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xB8B2AC, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xFFFFFFFF);

super.setStyleSeparateurHorizontaux(0, 0xFFFFFFFF);

super.setDessinerLigneVide(false);

super.setCadreCelluleSelection(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Ztim_Bg_Sheet_Select@dpi1x.png?_3NP_5_5_5_5", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {5, 5, 5, 5}, 0xFFFFFFFF, 1, 1));

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF);

super.setImagePlusMoins("E:\\Mes projets\\Projet ROGER\\Tono CF\\Ztim_Break_Pict@dpi1x.png?E2_4O");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de ZR_DossiersFichiers
 */
public void selectionLigne()
//  Cas d'erreur
{
super.selectionLigne();

// // Cas d'erreur
// si ZR_DossiersFichiers = -1 ALORS
if(this.opEgal(-1))
{
// 	retour
return;

}

// si ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Type = type_Dossier ALORS
if(this.get(this).get("ATT_Type").opEgal("Dossier"))
{
// 	GestionSélectionDossier()
fWD_gestionSelectionDossier();

}

// si ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Type = type_Fichier ALORS
if(this.get(this).get("ATT_Type").opEgal("Fichier"))
{
// 	GestionSélectionFichier()
fWD_gestionSelectionFichier();

}

// GestionOptionDispo()
fWD_gestionOptionDispo();

}




/**
 * Traitement: Appui long / Affichage menu contextuel de ZR_DossiersFichiers
 */
public WDObjet trtAffichageMenuContextuel()
//  Mode multi sélection
{
super.trtAffichageMenuContextuel();

// // Mode multi sélection
// gbModeSélection = vrai
vWD_gbModeSelection.setValeur(true);

return new WDVoid("fWD_appui_long_Affichage_menu_contextuel_de_ZR_DossiersFichiers");
}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
super.activerEcouteurAffichageMenuContextuel();
}

////////////////////////////////////////////////////////////////////////////
protected boolean isModeMultiColonne()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_DossiersFichiers mWD_ZR_DossiersFichiers;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Explorateur_Documents_2
////////////////////////////////////////////////////////////////////////////
//  Résumé : Affiche le contenu de la variable gsListeAAfficher dans la fenêtre
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
public void fWD_afficheContenu()
{
// PROCEDURE AfficheContenu()
initExecProcLocale("AfficheContenu");

try
{
// ZoneRépétéeSupprimeTout(ZR_DossiersFichiers)
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_DossiersFichiers);

// si gbModeRep ALORS
if(vWD_gbModeRep.getBoolean())
{
// 	taDossier est un tableau associatif d'entiers
WDObjet vWD_taDossier = WDVarNonAllouee.ref;
vWD_taDossier = new WDTableauAssociatif(0x0, (new WDChaineU("")), 16, 0, 8);

// 	POUR TOUTE CHAÎNE sFichier DE gsListeAAfficher SEPAREE PAR RC
IWDParcours parcours1 = null;
try
{
WDObjet vWD_sFichier = new WDChaineU();
parcours1 = WDParcoursSousChaine.pourTout(vWD_sFichier, null, null, vWD_gsListeAAfficher, "\r\n", 0x2);
while(parcours1.testParcours())
{
// 		si taDossier[fExtraitChemin(sFichier,fDisque+fRépertoire)] = 0 ALORS
if(vWD_taDossier.get(WDAPIFichier.fExtraitChemin(parcours1.getVariableParcours().getString(),3)).opEgal(0))
{
// 			taDossier[fExtraitChemin(sFichier,fDisque+fRépertoire)] = 1
vWD_taDossier.get(WDAPIFichier.fExtraitChemin(parcours1.getVariableParcours().getString(),3)).setValeur(1);

}
else
{
// 			taDossier[fExtraitChemin(sFichier,fDisque+fRépertoire)]+=1
vWD_taDossier.get(WDAPIFichier.fExtraitChemin(parcours1.getVariableParcours().getString(),3)).setValeur(vWD_taDossier.get(WDAPIFichier.fExtraitChemin(parcours1.getVariableParcours().getString(),3)).opPlus(1));

}

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// 	pour tout nValeur,sClé de taDossier
IWDParcours parcours2 = null;
try
{
WDObjet vWD_nValeur = WDParcoursFactory.creerVariableParcours(vWD_taDossier);
WDChaineU vWD_sCle = new WDChaineU();
parcours2 = WDParcoursFactory.pourTout(vWD_taDossier, vWD_nValeur, vWD_sCle, null, null, 0x0, 0x2);
while(parcours2.testParcours())
{
// 		si sClé ~= "" ALORS
if(vWD_sCle.opEgalSouple(""))
{
// 			continuer
continue;

}

// 		SI ACTB_ActionBar..ValeurRecherche <> "" _ET_ Contient(sClé,ACTB_ActionBar..ValeurRecherche,SansCasse) = Faux ALORS
if((mWD_ACTB_ActionBar.getProp(EWDPropriete.PROP_VALEURRECHERCHE).opDiff("") && WDAPIChaine.contient(vWD_sCle,mWD_ACTB_ActionBar.getProp(EWDPropriete.PROP_VALEURRECHERCHE),4).opEgal(false)))
{
// 			CONTINUER
continue;

}

// 		nIndiceAjout est un entier = ZoneRépétéeAjouteLigne(ZR_DossiersFichiers)
WDObjet vWD_nIndiceAjout = new WDEntier4();


vWD_nIndiceAjout.setValeur(WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_DossiersFichiers));


// 		repEncour est une chaine=""
WDObjet vWD_repEncour = new WDChaineU();


vWD_repEncour.setValeur("");


// 		<COMPILE SI TypeConfiguration <> iOS>
{
// 			repEncour =SysRepCarteStockage()
vWD_repEncour.setValeur(WDAPISys.sysRepCarteStockage());

}

// 		si sClé+[fsep] =repEncour +[fsep] ALORS
if(vWD_sCle.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opEgal(vWD_repEncour.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep()))))
{
// 			ZR_DossiersFichiers[nIndiceAjout].LIB_Nom = "Mémoire de stockage interne"
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("LIB_Nom").setValeur("Mémoire de stockage interne");

}
else
{
// 			ZR_DossiersFichiers[nIndiceAjout].LIB_Nom = ExtraitChaîne(sClé,2,fSep,DepuisFin) + " (" + nValeur + ")"
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("LIB_Nom").setValeur(WDAPIChaine.extraitChaine(vWD_sCle,2,WDAPIFichier.fSep(),1).opPlus(" (").opPlus(parcours2.getVariableParcours()).opPlus(")"));

}

// 		ZR_DossiersFichiers[nIndiceAjout].ATT_CheminComplet = sClé
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_CheminComplet").setValeur(vWD_sCle);

// 		ZR_DossiersFichiers[nIndiceAjout].ATT_Selection = faux
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_Selection").setValeur(false);

// 		ZR_DossiersFichiers[nIndiceAjout].ATT_Type = type_Dossier
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_Type").setValeur("Dossier");

}

}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


}
else
{
// 	POUR TOUTE CHAÎNE sFichier DE gsListeAAfficher SEPAREE PAR RC
IWDParcours parcours3 = null;
try
{
WDObjet vWD_sFichier = new WDChaineU();
parcours3 = WDParcoursSousChaine.pourTout(vWD_sFichier, null, null, vWD_gsListeAAfficher, "\r\n", 0x2);
while(parcours3.testParcours())
{
// 		SI sFichier ~= "" ALORS
if(parcours3.getVariableParcours().opEgalSouple(""))
{
// 			CONTINUER
continue;

}

// 		SI ACTB_ActionBar..ValeurRecherche <> "" _ET_ Contient(sFichier,ACTB_ActionBar..ValeurRecherche,SansCasse) = Faux ALORS
if((mWD_ACTB_ActionBar.getProp(EWDPropriete.PROP_VALEURRECHERCHE).opDiff("") && WDAPIChaine.contient(parcours3.getVariableParcours(),mWD_ACTB_ActionBar.getProp(EWDPropriete.PROP_VALEURRECHERCHE),4).opEgal(false)))
{
// 			CONTINUER
continue;

}

// 		nIndiceAjout est un entier
WDObjet vWD_nIndiceAjout = new WDEntier4();



// 		si fRepExiste(sFichier) = vrai ALORS
if(WDAPIFichier.fRepertoireExiste(parcours3.getVariableParcours().getString()).opEgal(true))
{
// 			nIndiceAjout = ZoneRépétéeAjouteLigne(ZR_DossiersFichiers)
vWD_nIndiceAjout.setValeur(WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_DossiersFichiers));

// 			repEncour est une chaine=""
WDObjet vWD_repEncour = new WDChaineU();


vWD_repEncour.setValeur("");


// 			<COMPILE SI TypeConfiguration <> iOS>
{
// 				repEncour =SysRepCarteStockage()
vWD_repEncour.setValeur(WDAPISys.sysRepCarteStockage());

}

// 			si sFichier = repEncour ALORS
if(parcours3.getVariableParcours().opEgal(vWD_repEncour))
{
// 				ZR_DossiersFichiers[nIndiceAjout].LIB_Nom = "Mémoire de stockage interne"
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("LIB_Nom").setValeur("Mémoire de stockage interne");

}
else
{
// 				ZR_DossiersFichiers[nIndiceAjout].LIB_Nom = ExtraitChaîne(sFichier,1,fSep,DepuisFin)
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("LIB_Nom").setValeur(WDAPIChaine.extraitChaine(parcours3.getVariableParcours(),1,WDAPIFichier.fSep(),1));

}

// 			ZR_DossiersFichiers[nIndiceAjout].ATT_CheminComplet = sFichier
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_CheminComplet").setValeur(parcours3.getVariableParcours());

// 			ZR_DossiersFichiers[nIndiceAjout].ATT_Selection = Faux
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_Selection").setValeur(false);

// 			ZR_DossiersFichiers[nIndiceAjout].ATT_Type = type_Dossier
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_Type").setValeur("Dossier");

}
else
{
// 			si fFichierExiste(sFichier) = vrai
if(WDAPIFichier.fFichierExiste(parcours3.getVariableParcours().getString()).opEgal(true))
{
// 				nIndiceAjout = ZoneRépétéeAjouteLigne(ZR_DossiersFichiers)
vWD_nIndiceAjout.setValeur(WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_DossiersFichiers));

// 				ZR_DossiersFichiers[nIndiceAjout].LIB_Nom = ExtraitChaîne(sFichier,1,fSep,DepuisFin)
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("LIB_Nom").setValeur(WDAPIChaine.extraitChaine(parcours3.getVariableParcours(),1,WDAPIFichier.fSep(),1));

// 				ZR_DossiersFichiers[nIndiceAjout].ATT_CheminComplet = sFichier
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_CheminComplet").setValeur(parcours3.getVariableParcours());

// 				ZR_DossiersFichiers[nIndiceAjout].ATT_Type = type_Fichier
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_Type").setValeur("Fichier");

// 				ZR_DossiersFichiers[nIndiceAjout].IMG_Logo = getImageSelonExtension(sFichier)
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("IMG_Logo").setValeur(GWDCPCOL_Extension.fWD_getImageSelonExtension(parcours3.getVariableParcours()));

// 				ZR_DossiersFichiers[nIndiceAjout].ATT_Selection = Faux
mWD_ZR_DossiersFichiers.get(vWD_nIndiceAjout).get("ATT_Selection").setValeur(false);

}

}

}

}
finally
{
if(parcours3 != null)
{
parcours3.finParcours();
}
}


}

// GestionOptionDispo()
fWD_gestionOptionDispo();

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Annule la sélection courante
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
public void fWD_annuleSelection()
{
// PROCEDURE AnnuleSélection()
initExecProcLocale("AnnuleSélection");

try
{
// pour TOUTE LIGNE i DE ZR_DossiersFichiers
IWDParcours parcours4 = null;
try
{
WDObjet vWD_i = new WDEntier4();
parcours4 = WDParcoursChamp.pourTout(mWD_ZR_DossiersFichiers, vWD_i, 0x2);
while(parcours4.testParcours())
{
// 	ZR_DossiersFichiers[ZR_DossiersFichiers]..CouleurFond = Transparent
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).setProp(EWDPropriete.PROP_COULEURFOND,-1);

// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection = faux
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").setValeur(false);

}

}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// gbModeSélection = Faux
vWD_gbModeSelection.setValeur(false);

// GestionOptionDispo()
fWD_gestionOptionDispo();

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Gère les options disponibles selon les éléments sélectionnés
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
public void fWD_gestionOptionDispo()
{
// PROCEDURE GestionOptionDispo()
initExecProcLocale("GestionOptionDispo");

try
{
}
finally
{
finExecProcLocale();
}

}



//  Résumé : Gère la sélection ou le lancement d'une application associée
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
public void fWD_gestionSelectionDossier()
{
// PROCEDURE GestionSélectionDossier()
initExecProcLocale("GestionSélectionDossier");

try
{
// si ZR_DossiersFichiers <= 0 ou ZR_DossiersFichiers > ZR_DossiersFichiers..Occurrence ALORS
if((mWD_ZR_DossiersFichiers.opInfEgal(0) | mWD_ZR_DossiersFichiers.opSup(mWD_ZR_DossiersFichiers.getProp(EWDPropriete.PROP_OCCURRENCE))))
{
// 	retour
return;

}

// si gbModeSélection = vrai ALORS
if(vWD_gbModeSelection.opEgal(true))
{
// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection = PAS(ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection)
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").setValeur((!mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").getBoolean()));

// 	SI ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection = faux ALORS
if(mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").opEgal(false))
{
// 		ZR_DossiersFichiers[ZR_DossiersFichiers]..CouleurFond = Transparent
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).setProp(EWDPropriete.PROP_COULEURFOND,-1);

// 		gbModeSélection = VérifieSelection()
vWD_gbModeSelection.setValeur(fWD_verifieSelection());

}
else
{
// 		ZR_DossiersFichiers[ZR_DossiersFichiers]..CouleurFond = GrisFoncé
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).setProp(EWDPropriete.PROP_COULEURFOND,8421504);

}

}
else
{
// 	gsFichierListe = ""
GWDPTono_CF.getInstance().vWD_gsFichierListe.setValeur("");

// 	ListerType(geTypeExtensionEnCours,Faux,ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_CheminComplet)
GWDCPCOL_Extension.fWD_listerType(vWD_geTypeExtensionEnCours,new WDBooleen(false),mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_CheminComplet"));

// 	tantque gsFichierListe = ""
while(GWDPTono_CF.getInstance().vWD_gsFichierListe.opEgal(""))
{
// 		multitache(-10)
WDAPIVM.multitache(new WDEntier4(-10));

}

// 	SI gsFichierListe = "__-1__" ALORS
if(GWDPTono_CF.getInstance().vWD_gsFichierListe.opEgal("__-1__"))
{
// 		info("Le répertoire est vide")
WDAPIDialogue.info("Le répertoire est vide"
);

// 		RETOUR
return;

}

// 	OuvreFenêtreMobile(FEN_Explorateur_Documents_2,gsFichierListe,ZR_DossiersFichiers[ZR_DossiersFichiers].LIB_Nom,geTypeExtensionEnCours,Faux,ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_CheminComplet,"GestionOptionDispo")
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Documents_2,new WDObjet[] {GWDPTono_CF.getInstance().vWD_gsFichierListe,mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("LIB_Nom"),vWD_geTypeExtensionEnCours,new WDBooleen(false),mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_CheminComplet"),new WDChaineU("GestionOptionDispo")} );

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Gère la sélection ou le lancement d'une application associée
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
public void fWD_gestionSelectionFichier()
{
// PROCEDURE GestionSélectionFichier()
initExecProcLocale("GestionSélectionFichier");

try
{
// SI ZR_DossiersFichiers <= 0 OU ZR_DossiersFichiers > ZR_DossiersFichiers..Occurrence ALORS
if((mWD_ZR_DossiersFichiers.opInfEgal(0) | mWD_ZR_DossiersFichiers.opSup(mWD_ZR_DossiersFichiers.getProp(EWDPropriete.PROP_OCCURRENCE))))
{
// 	RETOUR
return;

}

// si gbModeSélection = vrai ALORS
if(vWD_gbModeSelection.opEgal(true))
{
// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection = pas(ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection)
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").setValeur((!mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").getBoolean()));

// 	SI ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection = faux ALORS
if(mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").opEgal(false))
{
// 		ZR_DossiersFichiers[ZR_DossiersFichiers]..CouleurFond = Transparent
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).setProp(EWDPropriete.PROP_COULEURFOND,-1);

// 		gbModeSélection = VérifieSelection()
vWD_gbModeSelection.setValeur(fWD_verifieSelection());

}
else
{
// 		ZR_DossiersFichiers[ZR_DossiersFichiers]..CouleurFond = GrisFoncé
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).setProp(EWDPropriete.PROP_COULEURFOND,8421504);

}

}
else
{
// 	LanceAppliAssociée(ZR_DossiersFichiers.ATT_CheminComplet)
WDAPIDiversSTD.lanceAppliAssociee(mWD_ZR_DossiersFichiers.mWD_ATT_CheminComplet.getString());

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Initialise la fenêtre 
//  Paramètres :
// 	sNouveauFichier (chaîne UNICODE - valeur par défaut="") :Nouveau fichier à ajouter si besoin
//  Valeur de retour :
//  	Aucune
// 
public void fWD_initialisationFenetre( WDObjet vWD_sNouveauFichier )
{
// PROCEDURE InitialisationFenêtre(local sNouveauFichier est une chaine = "")
initExecProcLocale("InitialisationFenêtre");

try
{
vWD_sNouveauFichier = WDParametre.traiterParametre(vWD_sNouveauFichier, 1, true, 16);


// gsListeAAfficher+=[rc]+sNouveauFichier
vWD_gsListeAAfficher.setValeur(vWD_gsListeAAfficher.opPlus(new WDChaineOptionnelle("\r\n").opPlus(vWD_sNouveauFichier)));
// ZR_DossiersFichiers..Visible = Vrai
mWD_ZR_DossiersFichiers.setProp(EWDPropriete.PROP_VISIBLE,true);

// AfficheContenu()
fWD_afficheContenu();

// gbModeSélection = faux
vWD_gbModeSelection.setValeur(false);

// GestionOptionDispo
fWD_gestionOptionDispo();

// ZoneRépétéeSelectMoins(ZR_DossiersFichiers)
WDAPIZoneRepetee.zoneRepeteeSelectMoins(mWD_ZR_DossiersFichiers);

}
finally
{
finExecProcLocale();
}

}
public void fWD_initialisationFenetre()
{
fWD_initialisationFenetre(new WDChaineU(""));
}



//  Résumé : Récupère les éléments sélectionnés dans la fenêtre
//  Paramètres :
//  Valeur de retour :
//  	chaîne UNICODE : liste des éléments sélectionnés
// 
public WDObjet fWD_recupereSelection()
{
// PROCEDURE RécupèreSélection() : chaine
initExecProcLocale("RécupèreSélection");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sChaineSelection = new WDChaineU();



// sChaineSélection est une chaine = ""

vWD_sChaineSelection.setValeur("");


// POUR TOUTE LIGNE nIndice DE ZR_DossiersFichiers
IWDParcours parcours5 = null;
try
{
WDObjet vWD_nIndice = new WDEntier4();
parcours5 = WDParcoursChamp.pourTout(mWD_ZR_DossiersFichiers, vWD_nIndice, 0x2);
while(parcours5.testParcours())
{
// 	si ZR_DossiersFichiers[nIndice].ATT_Selection = Vrai ALORS		
if(mWD_ZR_DossiersFichiers.get(parcours5.getVariableParcours()).get("ATT_Selection").opEgal(true))
{
// 		sChaineSélection+= [rc] + ZR_DossiersFichiers[nIndice].ATT_CheminComplet
vWD_sChaineSelection.setValeur(vWD_sChaineSelection.opPlus(new WDChaineOptionnelle("\r\n").opPlus(mWD_ZR_DossiersFichiers.get(parcours5.getVariableParcours()).get("ATT_CheminComplet"))));
}

}

}
finally
{
if(parcours5 != null)
{
parcours5.finParcours();
}
}


// renvoyer sChaineSélection
return vWD_sChaineSelection;

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Supprime un élément
//  Paramètres :
// 	sCheminComplet (chaîne UNICODE) : Chemin de l'élément
// 	sType (chaîne UNICODE - valeur par défaut="") : Type de fichier
//  Valeur de retour :
//  	Aucune
// 
public void fWD_suppressionElement( WDObjet vWD_sCheminComplet , WDObjet vWD_sType )
{
// PROCEDURE SuppressionElement(local sCheminComplet est une chaine, local sType est une chaine = "")
initExecProcLocale("SuppressionElement");

try
{
vWD_sCheminComplet = WDParametre.traiterParametre(vWD_sCheminComplet, 1, true, 16);

vWD_sType = WDParametre.traiterParametre(vWD_sType, 2, true, 16);


// si fRepExiste(sCheminComplet) ALORS
if(WDAPIFichier.fRepertoireExiste(vWD_sCheminComplet.getString()).getBoolean())
{
// 	sType = type_Dossier
vWD_sType.setValeur("Dossier");

}

// si fFichierExiste(sCheminComplet) ALORS
if(WDAPIFichier.fFichierExiste(vWD_sCheminComplet.getString()).getBoolean())
{
// 	sType = type_Fichier
vWD_sType.setValeur("Fichier");

}

// SELON sType
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON sType
WDObjet _WDExpSelon0 = vWD_sType;
if(_WDExpSelon0.opEgal("Dossier"))
{
// 		SI fRepSupprime(sCheminComplet,frRécursif)	 = Faux ALORS
if(WDAPIFichier.fRepSupprime(vWD_sCheminComplet.getString(),1).opEgal(false))
{
// 			Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

// 			RETOUR
return;

}

// 		gsListeAAfficher = 	Remplace(gsListeAAfficher,sCheminComplet,"")
vWD_gsListeAAfficher.setValeur(WDAPIChaine.remplace(vWD_gsListeAAfficher,vWD_sCheminComplet,new WDChaineU("")));

}
else if(_WDExpSelon0.opEgal("Fichier"))
{
// 		SI fSupprime(sCheminComplet) = Faux ALORS
if(WDAPIFichier.fSupprime(vWD_sCheminComplet.getString()).opEgal(false))
{
// 			Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

// 			RETOUR
return;

}

// 		gsListeAAfficher = 	Remplace(gsListeAAfficher,sCheminComplet,"")	
vWD_gsListeAAfficher.setValeur(WDAPIChaine.remplace(vWD_gsListeAAfficher,vWD_sCheminComplet,new WDChaineU("")));

}
else {
// 		Erreur("Type inconnue")
WDAPIDialogue.erreur("Type inconnue");

}

}

}
finally
{
finExecProcLocale();
}

}
public void fWD_suppressionElement(WDObjet vWD_sCheminComplet)
{
fWD_suppressionElement(vWD_sCheminComplet, new WDChaineU(""));
}



//  Résumé : Vérifie la sélection courante
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	booléen : Vrai si une sélection est encore en cours
// 
public WDObjet fWD_verifieSelection()
{
// PROCEDURE VérifieSelection() : booléen
initExecProcLocale("VérifieSelection");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bSelection = new WDBooleen();



// bSelection est un booléen = Faux

vWD_bSelection.setValeur(false);


// POUR i=1 _a_ ZR_DossiersFichiers..Occurrence
// Délimiteur de visibilité pour ne pas étendre la visibilité des variables temporaires _WDExpBorneMax et _WDExpPas
{
WDObjet _WDExpBorneMax0 = new WDEntier4(mWD_ZR_DossiersFichiers.getProp(EWDPropriete.PROP_OCCURRENCE));
// POUR i=1 _a_ ZR_DossiersFichiers..Occurrence
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(_WDExpBorneMax0);vWD_i.opInc())
{
// 	SI bSelection = Vrai ALORS renvoyer bSelection
if(vWD_bSelection.opEgal(true))
{
// 	SI bSelection = Vrai ALORS renvoyer bSelection
return vWD_bSelection;

}

// 	bSelection = ZR_DossiersFichiers[i].ATT_Selection
vWD_bSelection.setValeur(mWD_ZR_DossiersFichiers.get(vWD_i).get("ATT_Selection"));

}
}

// SI bSelection = Vrai ALORS RENVOYER bSelection
if(vWD_bSelection.opEgal(true))
{
// SI bSelection = Vrai ALORS RENVOYER bSelection
return vWD_bSelection;

}

// renvoyer faux
return new WDBooleen(false);

}
finally
{
finExecProcLocale();
}

}




/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Documents_2.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xF1000000, 0xF39621, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOPT_Option1 extends WDOptionMenu
{
public GWDMOPT_Option1(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2410778432011402197l);

super.setNom("OPT_Option1");

super.setType(40001);

super.setLibelle("Option");

super.setEtat(0);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\ANL13210@dpi1x.png");

super.setVisible(true);

super.setCochee(false);

super.setNumero(2);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// si TypeFile="Doc" ALORS
// si TypeFile="Doc" ALORS
if(GWDPTono_CF.getInstance().vWD_TypeFile.opEgal("Doc"))
{
// 	POUR TOUTE LIGNE nIndice DE ZR_DossiersFichiers
IWDParcours parcours6 = null;
try
{
WDObjet vWD_nIndice = new WDEntier4();
parcours6 = WDParcoursChamp.pourTout(mWD_ZR_DossiersFichiers, vWD_nIndice, 0x2);
while(parcours6.testParcours())
{
// 		SI ZR_DossiersFichiers[nIndice].ATT_Selection=Vrai ALORS
if(mWD_ZR_DossiersFichiers.get(parcours6.getVariableParcours()).get("ATT_Selection").opEgal(true))
{
// 			HLitRecherchePremier(t_fileplainte,FileName,ZR_DossiersFichiers[nIndice].ATT_CheminComplet)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("filename"),mWD_ZR_DossiersFichiers.get(parcours6.getVariableParcours()).get("ATT_CheminComplet"));

// 			SI PAS HTrouve(t_fileplainte) ALORS
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte")).getBoolean()))
{
// 				t_fileplainte.TypeContenu	= "Document"
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").setValeur("Document");

// 				t_fileplainte.FileName		= ZR_DossiersFichiers[nIndice].ATT_CheminComplet
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("filename").setValeur(mWD_ZR_DossiersFichiers.get(parcours6.getVariableParcours()).get("ATT_CheminComplet"));

// 				HAjoute(t_fileplainte)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"));

}

}

}

}
finally
{
if(parcours6 != null)
{
parcours6.finParcours();
}
}


}

// si TypeFile="Image" ALORS
if(GWDPTono_CF.getInstance().vWD_TypeFile.opEgal("Image"))
{
// 	POUR TOUTE LIGNE nIndice DE ZR_DossiersFichiers
IWDParcours parcours7 = null;
try
{
WDObjet vWD_nIndice = new WDEntier4();
parcours7 = WDParcoursChamp.pourTout(mWD_ZR_DossiersFichiers, vWD_nIndice, 0x2);
while(parcours7.testParcours())
{
// 		SI ZR_DossiersFichiers[nIndice].ATT_Selection=Vrai ALORS
if(mWD_ZR_DossiersFichiers.get(parcours7.getVariableParcours()).get("ATT_Selection").opEgal(true))
{
// 			HLitRecherchePremier(t_fileplainte,FileName,ZR_DossiersFichiers[nIndice].ATT_CheminComplet)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("filename"),mWD_ZR_DossiersFichiers.get(parcours7.getVariableParcours()).get("ATT_CheminComplet"));

// 			SI PAS HTrouve(t_fileplainte) ALORS
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte")).getBoolean()))
{
// 				t_fileplainte.TypeContenu	= "Image"
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").setValeur("Image");

// 				t_fileplainte.FileName		= ZR_DossiersFichiers[nIndice].ATT_CheminComplet
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("filename").setValeur(mWD_ZR_DossiersFichiers.get(parcours7.getVariableParcours()).get("ATT_CheminComplet"));

// 				HAttacheMémo(t_fileplainte, FileImage, IMG_Logo..Valeur, hMémoBin)
WDAPIHF.hAttacheMemo(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("fileimage"),mWD_ZR_DossiersFichiers.mWD_IMG_Logo.getProp(EWDPropriete.PROP_VALEUR).getString(),23);

// 				HAjoute(t_fileplainte)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"));

}

}

}

}
finally
{
if(parcours7 != null)
{
parcours7.finParcours();
}
}


}

// si TypeFile="Audio" ALORS
if(GWDPTono_CF.getInstance().vWD_TypeFile.opEgal("Audio"))
{
// 	POUR TOUTE LIGNE nIndice DE ZR_DossiersFichiers
IWDParcours parcours8 = null;
try
{
WDObjet vWD_nIndice = new WDEntier4();
parcours8 = WDParcoursChamp.pourTout(mWD_ZR_DossiersFichiers, vWD_nIndice, 0x2);
while(parcours8.testParcours())
{
// 		SI ZR_DossiersFichiers[nIndice].ATT_Selection=Vrai ALORS
if(mWD_ZR_DossiersFichiers.get(parcours8.getVariableParcours()).get("ATT_Selection").opEgal(true))
{
// 			HLitRecherchePremier(t_fileplainte,FileName,ZR_DossiersFichiers[nIndice].ATT_CheminComplet)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("filename"),mWD_ZR_DossiersFichiers.get(parcours8.getVariableParcours()).get("ATT_CheminComplet"));

// 			SI PAS HTrouve(t_fileplainte) ALORS
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte")).getBoolean()))
{
// 				t_fileplainte.TypeContenu	= "Audio"
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").setValeur("Audio");

// 				t_fileplainte.FileName		= ZR_DossiersFichiers[nIndice].ATT_CheminComplet
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("filename").setValeur(mWD_ZR_DossiersFichiers.get(parcours8.getVariableParcours()).get("ATT_CheminComplet"));

// 				HAjoute(t_fileplainte)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"));

}

}

}

}
finally
{
if(parcours8 != null)
{
parcours8.finParcours();
}
}


}

// ferme()
WDAPIFenetre.ferme();

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Option1 mWD_OPT_Option1 = new GWDMOPT_Option1(true);

public void initialiserSousObjets()
{
mWD_OPT_Option1.initialiserObjet();
super.ajouterMenu(mWD_OPT_Option1);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410778432011336661l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



/**
 * Traitement: Déclarations globales de FEN_Explorateur_Documents_2
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre(gsListeAAfficher est une chaîne, LOCAL  gsTitre est une chaîne= "Explorateur", LOCAL geTypeExtensionEnCours est une EType = Vide, gbModeRep est un booléen = Vrai...
super.declarerGlobale(WD_tabParam, 1, 6);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gsListeAAfficher = WD_tabParam[0];
}
else { vWD_gsListeAAfficher = null; }
super.ajouterVariableGlobale("gsListeAAfficher",vWD_gsListeAAfficher);

// Traitement du paramètre n°1
if(1<WD_ntabParamLen) 
{
vWD_gsTitre = WD_tabParam[1];
}
else { vWD_gsTitre = new WDChaineU("Explorateur"); }
super.ajouterVariableGlobale("gsTitre",vWD_gsTitre);

// Traitement du paramètre n°2
if(2<WD_ntabParamLen) 
{
vWD_geTypeExtensionEnCours = WD_tabParam[2];
}
else { vWD_geTypeExtensionEnCours = GWDCPCOL_Extension.GWDEEType.Vide; }
super.ajouterVariableGlobale("geTypeExtensionEnCours",vWD_geTypeExtensionEnCours);

// Traitement du paramètre n°3
if(3<WD_ntabParamLen) 
{
vWD_gbModeRep = WD_tabParam[3];
}
else { vWD_gbModeRep = new WDBooleen(true); }
super.ajouterVariableGlobale("gbModeRep",vWD_gbModeRep);

// Traitement du paramètre n°4
if(4<WD_ntabParamLen) 
{
vWD_gsRepEnCours = WD_tabParam[4];
}
else { vWD_gsRepEnCours = new WDChaineU(""); }
super.ajouterVariableGlobale("gsRepEnCours",vWD_gsRepEnCours);

// Traitement du paramètre n°5
if(5<WD_ntabParamLen) 
{
vWD_gpCallBack = WD_tabParam[5];
}
else { vWD_gpCallBack = new WDChaineU(""); }
super.ajouterVariableGlobale("gpCallBack",vWD_gpCallBack);


vWD_gsListeAAfficher = WDParametre.traiterParametre(vWD_gsListeAAfficher, 1, false, 16);

vWD_gsTitre = WDParametre.traiterParametre(vWD_gsTitre, 2, true, 16);

vWD_geTypeExtensionEnCours = WDParametre.traiterParametreEnumeration(vWD_geTypeExtensionEnCours, 3, true, GWDCPCOL_Extension.GWDEEType.class);

vWD_gbModeRep = WDParametre.traiterParametre(vWD_gbModeRep, 4, false, 1);

vWD_gsRepEnCours = WDParametre.traiterParametre(vWD_gsRepEnCours, 5, true, 16);

vWD_gpCallBack = WDParametre.traiterParametre(vWD_gpCallBack, 6, false, 16);


// gbModeSélection est un booléen = Faux // Vrai si on passe en mode sélection multiple
vWD_gbModeSelection = new WDBooleen();

vWD_gbModeSelection.setValeur(false);

super.ajouterVariableGlobale("gbModeSélection",vWD_gbModeSelection);



// FEN_Explorateur_Documents_2..Titre = gsTitre
GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Documents_2.setProp(EWDPropriete.PROP_TITRE,vWD_gsTitre);

}




/**
 * Traitement: Fin d'initialisation de FEN_Explorateur_Documents_2
 */
public void init()
//  Initialise la fenêtre
{
super.init();

// // Initialise la fenêtre
// InitialisationFenêtre()
fWD_initialisationFenetre();

}




/**
 * Traitement: Fermeture de FEN_Explorateur_Documents_2
 */
public void fermetureFenetre()
//  Callback en fermeture (pour que la fenêtre précédente soit à jour)
{
super.fermetureFenetre();

// // Callback en fermeture (pour que la fenêtre précédente soit à jour)
// SI gpCallBack <>"" ALORS
if(vWD_gpCallBack.opDiff(""))
{
// 	ExécuteTraitement(gpCallBack,trtProcédure)
WDAPIVM.executeTraitement(vWD_gpCallBack,10);

}

}




/**
 * Traitement: Fermeture d'une fenêtre fille de FEN_Explorateur_Documents_2
 */
public void fermetureFenetreFille()
{
super.fermetureFenetreFille();

// si TypeFile="" ALORS
// si TypeFile="" ALORS
if(GWDPTono_CF.getInstance().vWD_TypeFile.opEgal(""))
{
// 	Ferme()
WDAPIFenetre.ferme();

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gsListeAAfficher = WDVarNonAllouee.ref;
 public WDObjet vWD_gsTitre = WDVarNonAllouee.ref;
 public WDObjet vWD_geTypeExtensionEnCours = WDVarNonAllouee.ref;
 public WDObjet vWD_gbModeRep = WDVarNonAllouee.ref;
 public WDObjet vWD_gsRepEnCours = WDVarNonAllouee.ref;
 public WDObjet vWD_gpCallBack = WDVarNonAllouee.ref;
 public WDObjet vWD_gbModeSelection = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Explorateur_Documents_2
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_DossiersFichiers = new GWDZR_DossiersFichiers();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Explorateur_Documents_2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 406, 320, 568, 160, 0);
declarerAgencement(0, 568, 247, 320, 568, 160, 1);
declarerAgencement(0, 593, 811, 800, 1280, 216, 0);
declarerAgencement(0, 948, 456, 800, 1280, 216, 1);
super.setQuid(2410778432010615765l);

super.setChecksum("702685044");

super.setNom("FEN_Explorateur_Documents_2");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

setAgencementEnEdition(0);
appliquerAgencement(getIndexAgencement());

super.setTitre("Explorateur Documents");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Explorateur_Documents_2
////////////////////////////////////////////////////////////////////////////
mWD_ZR_DossiersFichiers.initialiserObjet();
super.ajouter("ZR_DossiersFichiers", mWD_ZR_DossiersFichiers);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_Explorateur_Documents_2
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 406);

break;
case 1 :
super.setTailleInitiale(568, 247);

break;
case 2 :
super.setTailleInitiale(593, 811);

break;
case 3 :
super.setTailleInitiale(948, 456);

break;
}
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPTono_CF.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTono_CF.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Documents_2;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN BLUE#WM";
}
}
