/**
 * Code generated by WINDEV Mobile - DO NOT MODIFY!
 * WINDEV Mobile object: Fenêtre
 * Android class: WIN_NFC
 * Date: 27/11/2019 11:56:24
 * Version of wdjava64.dll: 24.0.254.7
 */


package com.mycompany.ts_broadcast.wdgen;


import com.mycompany.ts_broadcast.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.jauge.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.nfc.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.pulltorefresh.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFWIN_NFC extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_NFC
////////////////////////////////////////////////////////////////////////////

/**
 * STC_TapCard
 */
class GWDSTC_TapCard extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_NFC.STC_TapCard
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3302920796771313366l);

super.setChecksum("983843109");

super.setNom("STC_TapCard");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Tap Shopper Card");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(304, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDSTC_TapCard mWD_STC_TapCard;

/**
 * PROGBAR_Progress_bar
 */
class GWDPROGBAR_Progress_bar extends WDJauge
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_NFC.PROGBAR_Progress_bar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,298,8);
super.setQuid(3302921836163930603l);

super.setChecksum("994378148");

super.setNom("PROGBAR_Progress_bar");

super.setType(10);

super.setBulle("");

super.setLibelle("Progress bar");

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(8, 35);

super.setTailleInitiale(304, 8);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(-1);

super.setParamJauge(0, 100, 100, false, false);

super.setImage("", 1, 0, 1);

super.setImageFond("", 1, 0, 1);

super.setStyleJauge(0xFFBF81, 0x859300, 0x859300, 0xDCDCDC, true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x6D6D6D, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xDCDCDC, 2.000000, 2.000000, 1, 1));

super.setParamAnimationChamp(21, 1202, 300);

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
public GWDPROGBAR_Progress_bar mWD_PROGBAR_Progress_bar;

/**
 * STC_CardDetails
 */
class GWDSTC_CardDetails extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_NFC.STC_CardDetails
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3302921926358788998l);

super.setChecksum("994920156");

super.setNom("STC_CardDetails");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 51);

super.setTailleInitiale(304, 191);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDSTC_CardDetails mWD_STC_CardDetails;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de WIN_NFC
////////////////////////////////////////////////////////////////////////////
public WDObjet fWD_readNFCTag( WDObjet vWD_tag )
{
initExecProcLocale("ReadNFCTag");

try
{
vWD_tag = WDParametre.traiterParametreClasse(vWD_tag, 1, false, WDNFCTag.class, 111);


// info("id" + tag.Identifier)
WDAPIDialogue.info(new WDChaineU("id").opPlus(vWD_tag.getProp(EWDPropriete.PROP_IDENTIFIANT)).getString());

// RESULT True
return new WDBooleen(true);

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
// Déclaration des champs du fils n°1 de WIN_NFC.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x383226, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Global declarations of WIN_NFC
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: End of initialization of WIN_NFC
 */
public void init()
{
super.init();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bIsValid = new WDBooleen();



// bIsValid is boolean = FindBroadCastReceiver()

vWD_bIsValid.setValeur(GWDCPCOL_GlobalProcedures.FindBroadCastReceiver());


// IF bIsValid THEN
if(vWD_bIsValid.getBoolean())
{
// 	ReadNFCCard()
GWDCPCOL_GlobalProcedures.ReadNFCCard();

}

}




/**
 * Traitement: Refreshing WIN_NFC by pull/release
 */
public WDObjet raffraichissementPTR()
{
super.raffraichissementPTR();

// ToastDisplay("Redraw")
WDAPIToast.toastAffiche("Redraw");

// WinRedraw(WIN_NFC)
WDAPIFenetre.fenRepeint(GWDPTS_Broadcast.getInstance().mWD_WIN_NFC);

return new WDVoid("raffraichissementPTR");
}




/**
 * Traitement: Double Tap/Left button double-click on WIN_NFC
 */
public void doubleClicSurBoutonGauche()
{
super.doubleClicSurBoutonGauche();

// PROGBAR_Progress_bar..Color = LightGreen
mWD_PROGBAR_Progress_bar.setProp(EWDPropriete.PROP_COULEUR,65280);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurDoubleTape();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre WIN_NFC
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_STC_TapCard = new GWDSTC_TapCard();
mWD_PROGBAR_Progress_bar = new GWDPROGBAR_Progress_bar();
mWD_STC_CardDetails = new GWDSTC_CardDetails();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre WIN_NFC
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3302920740936332162l);

super.setChecksum("987825381");

super.setNom("WIN_NFC");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("NFC");

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

super.setPullToRefresh("", 0xFFFFFFFF);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_NFC
////////////////////////////////////////////////////////////////////////////
mWD_STC_TapCard.initialiserObjet();
super.ajouter("STC_TapCard", mWD_STC_TapCard);
mWD_PROGBAR_Progress_bar.initialiserObjet();
super.ajouter("PROGBAR_Progress_bar", mWD_PROGBAR_Progress_bar);
mWD_STC_CardDetails.initialiserObjet();
super.ajouter("STC_CardDetails", mWD_STC_CardDetails);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPTS_Broadcast.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTS_Broadcast.getInstance();
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
public boolean isThemeDark()
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
return GWDPTS_Broadcast.getInstance().mWD_WIN_NFC;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN BLUE GREY#WM";
}
}
