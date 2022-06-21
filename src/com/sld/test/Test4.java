package com.sld.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Test4 {
    public static void main(String[] args) {
        //测试union
        String[] arr1 = {"11","14","16","20","21","23","25","26","27","28","29","30","33","34","35","40","98","99","1101","1201","1512","1625","1801","2813","50002766","50002768","50006842","50006843","50007216","50007218","50008075","50008090","50008141","50008163","50008164","50008165","50010404","50010728","50010788","50011397","50011665","50011699","50011740","50011949","50011972","50012029","50012082","50012100","50012164","50013864","50013886","50014811","50014812","50014927","50016348","50016349","50016422","50017300","50018004","50018222","50018264","50019095","50019780","50020275","50020332","50020485","50020579","50020611","50020808","50020857","50022517","50022703","50023282","50023717","50023724","50023804","50024099","50024971","50025004","50025110","50025111","50025618","50025705","50025707","50026316","50026555","50026800","50050359","50074001","50158001","50454031","50468001","50510002","120894001","121266001","122650005","122684003","122718004","122852001","122928002","122950001","122952001","123536002","124044001","124050001","124242008","124354002","124458005","124466001","124468001","124470001","124484008","124568010","124698018","124844002","124852003","125102006","126700003","126762001","127442006","127450004","127452002","127458007","127484003","127492006","127508003","127876007","201156706","201162107","201173506","201207402","201307427","201402901"};
        String[] arr2 = {"1205","1402","1403","1622","1623","1624","1629","2132","2159","2165","2301","2305","2309","2310","2311","2512","2618","2801","2909","3035","3306","3314","3331","3332","3338","3412","3415","11542","21657","21992","26691","29439","30111","30645","78307","92536","110201","110202","110203","110205","110206","110207","110209","110210","110211","110215","110308","110501","110507","110511","110805","110809","111201","111219","111409","111703","123270","140116","140117","140701","162103","162104","162116","162205","164206","210207","210605","211104","211112","211503","211707","211708","211710","217302","217309","217311","217312","261407","290501","290503","290601","302909","302910","350201","350210","350212","350213","350301","350310","350401","350402","350404","350407","350408","350409","350502","350504","350507","350709","350712","3253280","3275815","3275815","3277074","3312691","3375755","3378431","3427211","3844047","4074818","4358671","4519575","6285882","6709166","6811072","7003456","7640333","7640333","7640333","8552106","9534985","12007522","12560165","17360299","26487995","30766890","34085174","41607646","45694061","45940546","50000013","50000049","50000054","50000063","50000072","50000141","50000177","50000201","50000346","50000360","50000436","50000557","50000561","50000582","50000583","50000584","50000671","50000697","50000802","50000813","50000852","50001248","50001290","50001378","50001423","50001705","50001718","50001739","50001865","50001871","50001931","50001965","50002258","50002409","50002415","50002506","50002535","50002809","50002889","50002893","50002894","50002896","50002898","50002899","50002901","50002916","50002918","50002922","50003112","50003291","50003312","50003318","50003321","50003464","50003679","50003695","50003770","50003773","50003793","50003794","50003848","50003860","50003948","50003949","50003987","50004204","50004363","50004399","50004417","50004620","50004621","50004645","50004658","50004674","50004687","50004725","50004743","50004767","50004788","50004806","50004816","50004835","50004849","50004870","50004893","50004925","50004960","50005009","50005011","50005018","50005033","50005050","50005051","50005060","50005174","50005266","50005270","50005271","50005272","50005273","50005457","50005458","50005462","50005491","50005715","50005730","50005736","50005747","50005752","50005756","50005757","50005929","50005935","50005945","50005952","50005961","50006000","50006020","50006101","50006217","50006277","50006528","50006583","50006584","50006844","50006846","50006948","50007003","50007010","50007116","50007185","50007211","50007359","50007361","50007368","50007370","50007372","50007377","50007380","50007381","50007385","50007390","50007395","50007396","50007398","50007400","50007402","50007403","50007405","50007407","50007409","50007410","50007411","50007413","50007414","50007416","50007417","50007418","50007420","50007421","50007426","50007427","50007428","50007432","50007433","50007435","50007436","50007437","50007438","50007439","50007442","50007443","50007445","50007446","50007447","50007450","50007451","50007452","50007453","50007454","50007456","50007458","50007459","50007462","50007464","50007465","50007466","50007467","50007468","50007470","50007471","50007473","50007474","50007476","50007477","50007479","50007481","50007483","50007599","50007664","50007670","50007675","50007777","50007779","50007785","50007792","50007793","50007805","50007810","50007815","50007822","50007825","50007832","50007833","50007840","50007841","50007856","50007863","50007868","50007874","50007875","50007883","50007901","50007913","50007919","50007925","50007931","50007937","50007943","50007949","50007955","50007961","50007967","50007973","50007979","50007985","50007991","50007997","50008003","50008009","50008021","50008027","50008034","50008039","50008046","50008059","50008144","50008146","50008148","50008179","50008246","50008274","50008275","50008280","50008281","50008330","50008351","50008352","50008366","50008369","50008430","50008482","50008528","50008542","50008543","50008544","50008545","50008548","50008551","50008552","50008553","50008554","50008555","50008556","50008557","50008563","50008565","50008566","50008604","50008613","50008622","50008681","50008737","50008741","50008798","50008876","50008881","50008882","50008883","50008884","50008885","50008886","50008888","50008889","50008890","50008897","50008898","50008899","50008900","50008901","50008904","50008905","50008906","50008919","50009032","50009033","50009035","50009037","50009047","50009106","50009146","50009206","50009339","50009521","50009556","50009578","50009821","50009837","50009857","50009980","50010099","50010101","50010158","50010159","50010160","50010167","50010356","50010368","50010392","50010394","50010401","50010402","50010406","50010410","50010420","50010422","50010464","50010485","50010518","50010524","50010527","50010530","50010531","50010537","50010539","50010540","50010550","50010566","50010567","50010605","50010609","50010613","50010686","50010689","50010749","50010757","50010813","50010814","50010815","50010828","50010850","50010916","50011123","50011127","50011129","50011130","50011150","50011153","50011159","50011161","50011165","50011167","50011257","50011277","50011404","50011555","50011556","50011704","50011717","50011718","50011720","50011721","50011739","50011744","50011751","50011752","50011753","50011754","50011826","50011827","50011866","50011877","50011888","50011893","50011896","50011975","50011977","50011978","50011980","50011990","50011991","50011992","50011993","50011996","50011997","50012010","50012019","50012031","50012036","50012037","50012038","50012041","50012042","50012043","50012044","50012047","50012048","50012049","50012064","50012067","50012068","50012079","50012080","50012083","50012097","50012099","50012101","50012135","50012142","50012148","50012149","50012160","50012161","50012162","50012163","50012165","50012166","50012167","50012186","50012307","50012308","50012314","50012320","50012331","50012341","50012342","50012343","50012345","50012346","50012347","50012348","50012349","50012351","50012353","50012354","50012374","50012382","50012404","50012412","50012424","50012436","50012448","50012455","50012466","50012473","50012487","50012512","50012514","50012546","50012600","50012601","50012645","50012676","50012709","50012711","50012716","50012766","50012770","50012771","50012772","50012773","50012774","50012775","50012776","50012777","50012778","50012781","50012784","50012785","50012786","50012787","50012825","50012834","50012880","50012888","50012907","50012908","50012910","50012937","50012946","50012960","50012981","50013003","50013007","50013008","50013009","50013010","50013011","50013021","50013035","50013039","50013061","50013151","50013189","50013194","50013195","50013196","50013198","50013202","50013217","50013226","50013228","50013253","50013322","50013405","50013474","50013477","50013508","50013517","50013596","50013618","50013796","50013810","50013823","50013865","50013866","50013868","50013869","50013870","50013871","50013875","50013876","50013877","50013878","50013882","50013888","50013891","50013892","50013908","50014023","50014025","50014043","50014125","50014126","50014127","50014200","50014227","50014248","50014479","50014480","50014481","50014482","50014493","50014496","50014503","50014507","50014509","50014512","50014756","50014757","50014759","50014762","50014763","50014764","50014813","50014850","50014851","50014852","50014853","50014855","50014923","50015127","50015134","50015194","50015200","50015207","50015210","50015215","50015218","50015219","50015230","50015262","50015285","50015288","50015292","50015293","50015294","50015369","50015370","50015371","50015372","50015373","50015374","50015376","50015377","50015380","50015455","50015510","50015518","50015541","50015558","50015563","50015568","50015757","50015758","50015759","50015762","50015771","50015816","50015886","50015915","50015943","50015988","50016058","50016091","50016094","50016119","50016161","50016189","50016195","50016203","50016213","50016214","50016235","50016293","50016353","50016368","50016383","50016434","50016443","50016450","50016455","50016472","50016473","50016474","50016663","50016687","50016689","50016729","50016889","50017072","50017077","50017085","50017117","50017269","50017311","50017316","50017318","50017319","50017321","50017504","50017589","50017616","50017619","50017625","50017722","50017757","50017776","50017859","50017865","50017871","50017903","50017905","50017906","50017913","50018005","50018025","50018079","50018082","50018096","50018103","50018158","50018184","50018189","50018194","50018218","50018224","50018225","50018230","50018244","50018245","50018323","50018327","50018398","50018406","50018718","50018720","50018772","50018783","50018784","50018785","50018786","50018787","50018788","50018801","50018808","50018813","50018820","50018869","50018870","50018909","50018948","50018960","50018971","50018975","50019007","50019055","50019058","50019072","50019073","50019077","50019079","50019080","50019084","50019096","50019097","50019098","50019240","50019242","50019250","50019269","50019273","50019286","50019288","50019289","50019293","50019296","50019309","50019318","50019341","50019361","50019494","50019503","50019510","50019539","50019592","50019601","50019617","50019630","50019641","50019651","50019690","50019712","50019784","50019790","50019812","50019835","50019935","50020006","50020007","50020126","50020174","50020180","50020192","50020206","50020296","50020333","50020341","50020348","50020352","50020358","50020362","50020369","50020372","50020392","50020397","50020400","50020417","50020421","50020442","50020445","50020449","50020459","50020472","50020480","50020486","50020487","50020489","50020490","50020491","50020492","50020493","50020494","50020519","50020573","50020585","50020596","50020599","50020608","50020612","50020614","50020615","50020617","50020618","50020646","50020671","50020672","50020673","50020674","50020675","50020677","50020679","50020680","50020681","50020834","50020835","50020836","50020840","50020841","50020842","50020843","50020845","50020846","50020848","50020850","50020851","50020856","50020906","50020966","50020995","50020998","50021011","50021027","50021033","50021042","50021045","50021046","50021048","50021057","50021105","50021120","50021132","50021133","50021153","50021422","50021615","50021794","50021837","50022263","50022270","50022271","50022357","50022440","50022514","50022516","50022520","50022568","50022648","50022679","50022728","50022734","50022735","50022759","50022760","50022764","50022768","50022769","50022772","50022774","50022775","50022777","50022889","50022891","50023066","50023068","50023096","50023100","50023105","50023109","50023110","50023165","50023206","50023280","50023283","50023293","50023294","50023363","50023370","50023392","50023415","50023444","50023497","50023498","50023502","50023504","50023508","50023613","50023625","50023660","50023686","50023688","50023690","50023725","50023726","50023727","50023728","50023729","50023950","50024048","50024050","50024060","50024094","50024095","50024096","50024097","50024098","50024101","50024103","50024104","50024109","50024126","50024128","50024138","50024158","50024168","50024207","50024247","50024248","50024253","50024300","50024346","50024369","50024389","50024394","50024400","50024443","50024607","50024641","50024697","50024698","50024699","50024767","50024770","50024772","50024802","50024803","50024804","50024805","50024809","50024848","50024863","50024864","50024865","50024881","50024926","50024927","50024928","50024929","50024932","50024934","50024935","50024936","50024937","50024938","50024944","50024956","50024957","50024963","50024964","50024992","50024993","50024997","50024998","50025007","50025008","50025009","50025010","50025012","50025062","50025108","50025109","50025133","50025200","50025201","50025320","50025321","50025322","50025323","50025480","50025555","50025621","50025646","50025654","50025680","50025682","50025689","50025710","50025785","50025832","50025838","50025839","50025864","50025883","50025884","50025885","50025889","50025945","50025996","50026002","50026022","50026033","50026034","50026036","50026037","50026039","50026040","50026043","50026045","50026054","50026055","50026057","50026058","50026059","50026060","50026063","50026064","50026065","50026066","50026067","50026068","50026069","50026070","50026071","50026072","50026073","50026312","50026398","50026403","50026420","50026436","50026457","50026460","50026471","50026523","50026554","50026617","50026627","50026659","50050199","50050371","50050372","50050378","50050439","50050464","50050471","50050489","50050519","50050520","50050546","50050622","50050643","50050644","50050646","50050647","50050648","50050725","50056001","50070004","50078001","50078002","50082008","50098008","50102011","50114008","50116005","50118013","50126003","50132001","50132002","50146004","50152002","50160001","50160002","50172001","50208006","50262002","50316001","50388003","50408001","50426004","50446020","50448024","50448025","50450016","50456019","50458018","50460022","50462016","50462018","50464015","50490002","50492001","50492002","50492006","50494001","50494002","50496001","50496015","50500001","50502002","50510011","50514003","50516004","50522001","50530002","50532001","50552001","50562004","50582002","50588003","50590001","50592002","50592011","50594001","50598001","50598011","50604005","50604012","50674004","50676001","50678006","50682004","50686002","50686004","50722001","50768001","50774026","50784029","50786034","50794038","50816010","50830007","50832009","50852002","58812044","65430268","68258975","69518178","70140384","75403976","80703862","81493384","83723450","95355560","103803639","104751213","104857139","118327581","118807556","120130160","120826009","120830006","120832006","120834004","120836006","120836007","120838004","120838013","120840006","120842003","120846007","120846008","120846009","120850005","120850006","120850007","120850008","120850009","120860002","120860003","120864005","120868003","120868008","120868009","120870002","120870003","120870004","120872004","120874002","120874004","120878006","120880002","120882002","120888002","120890002","121124002","121128001","121132002","121138001","121146003","121148003","121156002","121162002","121166003","121178002","121196001","121254001","121270001","121272001","121274002","121278001","121280001","121284001","121288001","121290002","121292001","121360001","121364003","121364004","121366010","121366011","121366034","121368002","121368010","121368025","121370001","121370030","121380002","121380009","121380022","121382005","121382006","121384005","121384016","121384022","121386003","121386009","121386020","121388020","121388024","121388045","121390006","121390007","121390019","121390022","121392003","121392004","121392033","121392034","121394007","121396029","121398006","121398019","121398020","121400005","121400006","121400019","121402026","121404016","121408009","121408018","121408037","121408038","121410016","121410037","121410048","121410049","121412004","121412050","121414009","121414042","121416008","121416010","121416021","121416042","121418029","121418033","121420031","121422036","121422058","121422059","121424002","121426002","121434003","121434004","121434005","121434010","121434026","121434050","121434057","121448009","121448012","121448014","121452006","121454006","121454011","121454013","121456019","121456022","121458001","121458010","121458041","121458052","121460005","121460027","121462001","121462007","121462024","121462040","121462057","121464001","121464004","121466001","121466009","121466010","121466042","121468015","121470039","121472013","121472014","121472034","121472046","121474002","121474016","121476002","121476003","121476023","121478018","121478023","121482007","121506001","121556006","121566005","121574004","121590005","121592002","121662001","121666001","121668001","121670001","121672001","121676001","121680001","121682001","121874002","121874003","121886004","121918001","121956004","121986001","122014001","122018001","122020001","122024003","122082001","122088002","122164003","122198005","122240006","122242007","122264001","122412001","122430002","122438001","122438002","122444001","122488002","122594001","122596004","122610004","122620013","122624007","122632007","122632010","122642004","122650004","122654005","122656008","122660002","122666001","122680006","122682001","122690003","122692006","122730001","122732001","122736001","122738001","122740001","122742001","122842003","122846003","122850001","122852003","122854005","122858004","122874003","122878004","122880002","122894005","122904002","122906002","122918003","122920002","122946001","122950002","122950007","122950008","122954001","122958002","122960001","122964001","122968002","122968003","122968007","122970002","122972004","122974003","122996002","122998001","123000001","123002001","123004001","123004002","123006001","123008001","123016002","123042002","123048001","123076001","123100001","123126002","123146002","123188001","123222007","123248003","123320006","123322001","123326001","123330001","123332001","123334001","123372001","123378001","123454001","123514003","123516002","123524005","123536003","123538002","123540001","123546001","123548001","123596001","123604001","123630001","123656002","123664001","123684001","123686001","123718001","123724001","123824002","123832003","123836002","123876002","123880001","123892001","123906001","124010002","124046001","124052001","124058003","124064001","124068001","124086006","124088007","124090010","124092006","124096010","124102008","124104007","124130011","124146004","124168015","124174017","124174018","124176002","124180005","124198016","124202008","124208010","124208023","124212008","124218015","124222019","124222024","124226006","124226018","124232009","124234012","124238002","124242005","124246007","124246008","124252004","124252007","124252018","124254004","124258003","124300002","124332005","124346005","124386001","124386002","124388001","124392002","124406003","124412002","124420003","124420006","124458001","124460001","124460002","124462001","124462004","124462006","124464006","124468004","124470011","124470013","124472004","124472007","124476007","124478007","124478009","124484013","124486002","124486006","124488008","124490003","124492002","124492003","124492004","124494003","124494008","124506004","124506009","124508011","124522008","124524012","124544010","124546013","124572017","124586001","124624001","124634003","124636001","124636003","124658001","124688007","124688012","124688027","124690010","124690013","124692003","124694013","124694015","124696012","124698020","124700014","124700026","124702014","124704006","124704007","124704010","124708025","124710006","124710010","124710016","124710019","124710024","124712010","124714007","124714013","124718005","124718015","124718017","124720003","124720004","124720007","124720016","124724001","124724008","124726006","124728003","124728004","124728011","124728016","124730001","124730007","124732009","124732010","124732011","124748019","124750012","124750020","124750021","124754004","124754015","124760006","124768001","124784001","124798007","124814001","124816005","124830001","124842004","124848001","124850005","124852006","124860002","124864003","124866006","124880002","124880005","124890005","124918001","124920001","124922001","124930001","124942005","124968001","124984005","124986002","124988005","124990004","125006003","125014002","125018001","125024005","125026010","125030002","125034010","125042002","125044003","125046003","125046004","125048009","125048010","125050034","125050040","125052004","125054001","125056001","125058001","125058009","125076025","125080007","125082002","125082033","125088001","125100031","125118004","125120002","125124003","125124004","125142004","125144005","125148003","125160006","125170003","125172008","125174010","125178006","125188004","125188005","125190001","125192002","125194003","125198006","125202011","125206001","125214002","125218004","125220015","125224005","125224006","125232003","125234004","125238003","125238008","125238010","125240002","125244003","125250009","125252009","125260002","125262002","125266007","125280018","125424001","125436003","125462002","125480001","125518004","125590004","125598002","125610001","125615221","125656001","125664001","125672021","125706031","125708012","125886001","125888001","125910001","125922001","125936001","125950001","125990003","126008001","126038001","126176002","126202001","126214002","126232001","126234001","126248004","126410003","126410004","126412005","126438002","126458017","126462002","126468002","126472003","126474002","126474003","126486001","126488001","126498017","126498025","126500035","126504013","126516018","126518001","126518004","126524016","126528012","126598001","126664001","126742001","126746001","126748002","126752001","126754001","126756002","126758001","126760001","126766001","126766002","126768001","126770001","127062001","127068001","127114001","127212001","127218010","127228001","127244001","127248001","127284012","127296015","127296016","127302014","127340001","127350001","127354001","127374002","127388004","127408001","127426001","127442005","127442007","127454001","127458001","127494005","127496003","127500002","127506001","127596001","127598002","127600002","127602002","127602003","127602004","127602005","127608004","127610002","127610003","127610004","127612003","127612004","127612005","127612006","127616004","127616005","127616006","127616007","127618002","127618003","127620002","127620003","127620005","127624002","127628002","127628003","127628004","127628005","127628006","127632001","127632002","127634001","127638002","127638003","127640002","127640003","127642001","127642002","127644001","127644002","127644003","127652002","127652003","127652012","127652013","127652014","127652019","127654005","127654008","127654021","127656008","127656013","127656023","127658001","127658011","127660006","127660007","127660008","127660020","127662001","127662002","127662006","127662007","127662008","127662015","127662018","127662037","127664002","127664007","127666008","127666019","127666020","127668005","127668006","127668007","127668025","127670007","127672005","127672006","127672007","127672011","127672015","127674021","127674043","127676003","127676004","127676005","127676006","127676018","127676019","127678003","127678004","127678005","127680007","127680009","127680010","127680011","127680013","127680014","127680015","127680017","127680026","127680035","127682004","127682005","127682006","127682019","127682048","127684008","127684009","127684010","127684027","127686003","127686023","127688003","127688013","127688021","127688022","127688025","127690008","127690009","127692005","127692013","127692023","127692027","127694004","127694011","127694014","127696003","127696004","127696005","127696006","127696021","127744003","127764005","127788001","127806002","127808006","127828005","127832005","127834005","127834006","127844002","127848005","127852004","127856001","127868012","127870008","127870009","127870010","127878007","127884008","127886012","127898009","127898014","127904001","127906001","127908001","127910001","127926010","132957495","132957495","134542668","146892724","155253842","177434481","177434481","180290799","190978488","200530001","200532010","200584005","200666001","200668001","200670001","200756001","200768004","200786004","200806005","200808006","200830005","200834003","200866001","200866002","200868001","200870001","200872001","200878002","200882003","200906001","200978002","200992001","200998002","201012001","201022003","201024001","201060002","201080004","201116001","201128001","201130501","201131101","201136801","201136901","201148110","201148111","201148609","201149605","201149809","201150605","201152506","201152813","201155401","201155413","201155607","201156204","201156402","201158405","201158406","201158513","201158811","201159808","201160207","201160701","201161209","201161605","201161714","201161806","201162102","201162202","201162404","201162808","201164001","201164006","201166702","201168410","201168614","201169214","201169507","201169617","201169805","201169815","201170029","201170116","201170315","201171217","201171314","201171415","201171818","201172006","201172608","201172816","201172821","201173115","201173116","201173303","201173319","201173913","201174001","201174403","201180901","201185902","201190303","201193206","201193606","201195701","201195801","201197902","201203302","201204901","201207203","201213002","201213901","201217001","201217101","201217201","201217401","201217814","201218209","201218210","201218611","201218613","201218711","201218812","201218904","201219802","201219908","201220013","201220307","201220411","201220433","201220615","201221007","201221108","201221405","201221705","201221714","201221719","201222105","201222108","201222213","201223106","201223401","201223509","201227702","201227713","201228108","201228112","201228309","201228310","201228804","201228809","201228812","201228906","201230104","201230109","201230516","201231502","201232102","201232704","201232801","201232908","201233909","201236312","201237304","201237510","201241307","201241402","201241501","201247207","201247601","201247602","201252319","201254101","201259974","201260862","201262781","201263086","201268491","201269798","201271673","201271882","201272477","201272600","201272694","201273398","201273465","201273466","201273886","201273960","201274679","201274970","201275274","201275777","201284105","201291802","201292210","201292709","201294501","201295001","201295101","201296201","201296503","201298402","201298601","201298701","201301201","201301714","201301732","201301735","201302301","201302410","201302509","201302533","201302605","201302606","201302802","201302908","201303114","201303304","201304029","201304133","201304136","201304722","201304807","201305112","201305305","201305605","201305609","201305620","201305717","201305826","201306010","201306024","201306213","201306233","201306607","201306623","201306708","201306908","201307208","201308305","201308401","201308804","201309207","201309506","201309724","201310104","201310125","201310233","201310403","201310406","201311102","201312202","201313001","201313101","201313606","201314104","201316503","201317202","201317502","201319503","201323402","201323702","201323703","201324001","201324201","201324202","201326802","201328302","201328601","201329101","201329611","201330001","201330010","201330101","201330210","201330407","201330409","201330806","201330902","201331321","201331804","201332308","201332705","201332904","201333405","201333408","201334511","201334714","201334820","201335011","201335012","201335218","201335309","201335402","201335502","201335921","201336012","201336016","201336418","201337008","201338002","201338101","201338201","201338301","201338513","201338814","201340303","201340312","201345308","201345411","201345415","201345622","201345911","201346214","201347103","201347204","201348601","201348736","201351147","201356651","201356955","201357049","201358416","201358752","201364904","201367001","201368102","201371301","201371828","201372221","201372616","201373215","201374926","201374927","201375019","201375120","201376515","201376801","201376807","201376819","201376926","201380322","201380419","201380910","201382019","201383414","201383716","201384019","201384114","201392403","201392501","201392601","201395501","201400203","201400603","201403204","201403301","201437848","201438654","201439639","201455830","201472302","201922793","204360488","276650588","283924091","305564601","323894871","372618679","378616392","378842703","387502624","425462699","425462699","431498707","481756930","515104004","536766077","565362792","568142695","572388544","584416680","588530393","592212923","592212923","593598619","597144474","607712955","611448412","618368798","631406614","650680783","653848019","696796451","699106660","719998008","741998404","742870766","761424968","797090004","797090009","803114123","803756995","804216069","807262541","828600036","835790077","845518556","845844704","852540040","852660161","881058024","901742372","901742372","902844016","904350744","926620294","928336491","928336491","937524971","941082311","941082311","943876116","945712261","951720913","960884313","964788046","969702417","978490622","980394857","1007614370","1007614370","1007718026","1010278112","1023774917","1026486752","1036562533","1037402559","1045040921","1057708396","1064568801","1065578194","1066152414","1069796125","1076144551","1078008035","1078282496","1078282496","1078282496","1079656257","1084086181","1089680437","1093750922","1095536978","1095536978","1121480936","1123356798","1126306511","1161752732","1163818713","1163818713","1183766881","1183766881","1183766881","1199204921","1199204921","1205080536","1205080536","1217322920","1264698874","1264698874","1323805921","1335085840","1345876260","1345876260","1350033244","1365464897","1391521096","1393132350","1393805145","1399968429","1400548370","1400670162","1403452822","1416962552","1419716335","1431449056","1438099536","1450419782","1480440851","1486160118","1486160118","1488792494","1496147398","1497800249","1497800249"};

        //测试insect
        String[] result_insect = intersect(arr1, arr2);
        System.out.println("求交集的结果如下：");
        for (String str : result_insect) {
            System.out.println(str);
        }

    }

    //并集（set唯一性）
    public static String[] union (String[] arr1, String[] arr2){
        Set<String> hs = new HashSet<String>();
        for(String str:arr1){
            hs.add(str);
        }
        for(String str:arr2){
            hs.add(str);
        }
        String[] result={};
        return hs.toArray(result);
    }

    //交集(注意结果集中若使用LinkedList添加，则需要判断是否包含该元素，否则其中会包含重复的元素)
    public static String[] intersect(String[] arr1, String[] arr2){
        List<String> l = new LinkedList<String>();
        Set<String> common = new HashSet<String>();
        for(String str:arr1){
            if(!l.contains(str)){
                l.add(str);
            }
        }
        for(String str:arr2){
            if(l.contains(str)){
                common.add(str);
            }
        }
        String[] result={};
        return common.toArray(result);
    }
    //求两个数组的差集
    public static String[] substract(String[] arr1, String[] arr2) {
        LinkedList<String> list = new LinkedList<String>();
        for (String str : arr1) {
            if(!list.contains(str)) {
                list.add(str);
            }
        }
        for (String str : arr2) {
            if (list.contains(str)) {
                list.remove(str);
            }
        }
        String[] result = {};
        return list.toArray(result);
    }
}