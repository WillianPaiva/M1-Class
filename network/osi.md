
[Source](https://en.wikipedia.org/wiki/OSI_model "Permalink to OSI model - Wikipedia, the free encyclopedia")

# OSI model - Wikipedia, the free encyclopedia

The **Open Systems Interconnection model** (**OSI Model**) is a [conceptual model][1] that characterizes and standardizes the [communication functions][2] of a telecommunication or computing system without regard of their
underlying internal structure and technology. Its goal is the interoperability of diverse communication systems with standard protocols. The model partitions a communication system into [abstraction layers][3]. The original
version of the model defined seven layers.

A layer serves the layer above it and is served by the layer below it. For example, a layer that provides error-free communications across a network provides the path needed by applications above it, while it calls the next lower
layer to send and receive packets that comprise the contents of that path. Two instances at the same layer are visualized as connected by a _horizontal_ connection in that layer.

The model is a product of the [Open Systems Interconnection][4] project at the [International Organization for Standardization][5] (ISO), maintained by the identification ISO/IEC 7498-1.

![][6]

Communication in the OSI-Model (example with layers 3 to 5)

## History 

In the late 1970s, two projects began independently, with the same goal: to define a unifying standard for the architecture of networking systems.[[_citation needed][8]_] One was administered by the International Organization for
Standardization (ISO), while the other was undertaken by the International Telegraph and Telephone Consultative Committee, or CCITT (the abbreviation is from the French version of the name). These two international standards bodies
each developed a document that defined similar networking models.

In 1983, these two documents were merged to form a standard called The Basic Reference Model for Open Systems Interconnection. The standard is usually referred to as the Open Systems Interconnection Reference Model, the OSI
Reference Model, or simply the OSI model. It was published in 1984 by both the ISO, as standard ISO 7498, and the renamed CCITT (now called the Telecommunications Standardization Sector of the International Telecommunication Unionr
or ITU-T) as standard X.200.

OSI had two major components, an _abstract model_ of networking, called the Basic Reference Model or seven-layer model, and a set of specific protocols.

The concept of a seven-layer model was provided by the work of [Charles Bachman][9] at Honeywell Information Services. Various aspects of OSI design evolved from experiences with the [ARPANET][10], NPLNET, EIN, [CYCLADES][11]
network and the work in IFIP WG6.1. The new design was documented in ISO 7498 and its various addenda. In this model, a networking system was divided into layers. Within each layer, one or more entities implement its functionality.
Each entity interacted directly only with the layer immediately beneath it, and provided facilities for use by the layer above it.

Protocols enable an entity in one host to interact with a corresponding entity at the same layer in another host. Service definitions abstractly described the functionality provided to an (N)-layer by an (N-1) layer, where N was
one of the seven layers of protocols operating in the local host.

The OSI standards documents are available from the ITU-T as the X.200-series of recommendations.[1] Some of the protocol specifications were also available as part of the ITU-T X series. The equivalent ISO and ISO/IEC standards
for the OSI model were available from ISO, but only some of them without fees.[2]

## Description of OSI layers 

The recommendation X.200 describes seven layers, labeled 1 to 7. Layer 1 is the lowest layer in this model.

| OSI Model |

| Layer                  | Data unit       | Function[3]                                                                                                                                          | Examples                           |
| ------ | ---- | ---------- | ------ |
| 7\. [Application][13]  | Data            | High-level [APIs][15], including resource sharing, remote file access, [directory services][16] and [virtual terminals][17]                          | HTTP, FTP, SMTP                    |
| 6\. [Presentation][21] | Data            | Translation of data between a networking service and an application;[character encoding][22], [data compression][23] and [encryption/decryption][24]
| 5\. [Session][25]      | Data            | Managing communication i.e. continuous exchange of information in the form of multiple back-and-forth transmissions between two nodes                | RPC, PAP                           |
| 4\. [Transport][29]    | Segments        | Reliable transmission of data segments between points on a network, including [segmentation][30], [acknowledgement][31] and [multiplexing][32]       | TCP, UDP                           |
| 3\. [Network][35]      | Packet/Datagram | Structuring and managing a multi-node network, including [addressing][38], [routing][39] and [traffic control][40]                                   | IPv4, IPv6, IPsec, AppleTalk, ICMP |
| 2\. [Data link][46]    | Bit/Frame       | Reliable transmission of data frames between two nodes connected by a physical layer                                                                 | PPP, IEEE 802.2, L2TP              |
| 1\. [Physical][52]     | Bit             | Transmission and reception of raw bit streams over a physical medium                                                                                 | DSL, USB                           |

At each level _N_, two entities at the communicating devices (layer N _peers_) exchange [protocol data units][55] (PDUs) by means of a layer N _protocol_. Each PDU contains a payload, called the [service data unit][56] (SDU), along
with protocol-related headers and/or footers.

Data processing by two communicating OSI-compatible devices is done as such:

1. The data to be transmitted is composed at the topmost layer of the transmitting device (layer _N_) into a [_protocol data unit][55]_ (_PDU_).
2. The _PDU_ is passed to layer _N-1_, where it is known as the [_service data unit][56]_ (_SDU_).
3. At layer _N-1_ the _SDU_ is [concatenated][57] with a header, a footer, or both, producing a _layer N-1 PDU_. It is then passed to layer _N-2_.
4. The process continues until reaching the lowermost level, from which the data is transmitted to the receiving device.
5. At the receiving device the data is passed from the lowest to the highest layer as a series of _SDU_s while being successively stripped from each layer's header and/or footer, until reaching the topmost layer, where the last of
the data is consumed.

Some orthogonal aspects, such as management and [security][58], involve all of the layers (See [ITU-T][59] X.800 Recommendation[4]). These services are aimed at improving the [CIA triad][60] \- [confidentiality][61],
 [integrity][62], and [availability][63] \- of the transmitted data. In practice, the availability of a communication service is determined by the interaction between [network design][64] and [network management][65] protocols.
 Appropriate choices for both of these are needed to protect against [denial of service][66].[[_citation needed][8]_]

### Layer 1: Physical Layer 

The [physical layer][52] has the following major functions:

* It defines the [electrical][68] and physical specifications of the data connection. It defines the relationship between a device and a physical [transmission medium][69] (e.g., a copper or [fiber optical cable][70]). This
includes the layout of [pins][71], [voltages][72], line [impedance][73], [cable][74] [specifications][75], signal timing, [hubs][76], [repeaters][77], [network adapters][78], [host bus adapters][79] (HBA used in [storage area
  networks][80]) and more.
* It defines the protocol to establish and terminate a connection between two directly connected nodes over a [communications][81] [medium][69].
* It may define the protocol for [flow control][82].
* It defines transmission mode i.e. simplex, half duplex, full duplex.
* It defines the [network topology][83] as [bus][84], [mesh][85], or [ring][86] being some of the most common.

The physical layer of [Parallel SCSI][87] operates in this layer, as do the physical layers of [Ethernet][88] and other local-area networks, such as [Token Ring][89], [FDDI][90], [ITU-T G.hn][91], and [IEEE 802.11][92] (Wi-Fi), as
well as personal area networks such as [Bluetooth][93] and [IEEE 802.15.4][94].

### Layer 2: Data Link Layer 

The [data link layer][46] provides [node-to-node data transfer][96] \-- a [reliable][97] link between two directly connected nodes, by detecting and possibly correcting errors that may occur in the physical layer. The data link
layer is divided into two sublayers:
* [Media Access Control][98] (MAC) layer - responsible for controlling how devices in a network gain access to data and permission to transmit it.
* [Logical Link Control][99] (LLC) layer - controls error checking and packet synchronization.

The [Point-to-Point Protocol][49] (PPP) is an example of a data link layer in the [TCP/IP][100] protocol stack.

The [ITU-T][59] [G.hn][91] standard, which provides high-speed local area networking over existing wires (power lines, phone lines and coaxial cables), includes a complete [data link layer][46] that provides both
[error correction][101] and [flow control][82] by means of a [selective-repeat][102] [sliding-window protocol][103].

### Layer 3: Network Layer 

The [network layer][35] provides the functional and procedural means of transferring variable length [data][105] sequences (called [datagrams][106]) from one node to another connected to the same _network._ It translates logical
network address into physical machine address. A network is a medium to which many nodes can be connected, on which every node has an _address_ and which permits nodes connected to it to transfer messages to other nodes connected
to it by merely providing the content of a message and the address of the destination node and letting the network find the way to deliver ("route") the message to the destination node. In addition to message [routing][39], the
network may (or may not) implement message delivery by splitting the message into several fragments, delivering each fragment by a separate route and reassembling the fragments, report delivery errors, etc.

Datagram delivery at the network layer is _not_ guaranteed to be _reliable_.

A number of layer-management protocols, a function defined in the _management annex_, ISO 7498/4, belong to the network layer. These include routing protocols, multicast group management, network-layer information and error, and
network-layer address assignment. It is the function of the payload that makes these belong to the network layer, not the protocol that carries them.[5]

### Layer 4: Transport Layer 

The [transport layer][29] provides the functional and procedural means of transferring variable-length data sequences from a source to a destination host via one or more networks, while maintaining the quality of service functions.

An example of a transport-layer protocol in the standard Internet stack is [Transmission Control Protocol][33] (TCP), usually built on top of the [Internet Protocol][108] (IP).

The transport layer controls the reliability of a given link through flow control, [segmentation/desegmentation][30], and error control. Some protocols are state- and connection-oriented. This means that the transport layer can
keep track of the segments and retransmit those that fail. The transport layer also provides the acknowledgement of the successful data transmission and sends the next data if no errors occurred. The transport layer creates
packets out of the message received from the application layer. Packetizing is a process of dividing the long message into smaller messages.

OSI defines five classes of connection-mode transport protocols ranging from class 0 (which is also known as TP0 and provides the fewest features) to class 4 (TP4, designed for less reliable networks, similar to the Internet).
Class 0 contains no error recovery, and was designed for use on network layers that provide error-free connections. Class 4 is closest to TCP, although TCP contains functions, such as the graceful close, which OSI assigns to the
session layer. Also, all OSI TP connection-mode [protocol][109] classes provide expedited data and preservation of record boundaries. Detailed characteristics of TP0-4 classes are shown in the following table:[6]

| Feature name                                                     | TP0 | TP1 | TP2 | TP3 | TP4 |
| ----- | ----- | ----- | ----- | ----- | ----- |
| Connection-oriented network                                      | Yes | Yes | Yes | Yes | Yes |
| Connectionless network                                           | No  | No  | No  | No  | Yes |
| Concatenation and separation                                     | No  | Yes | Yes | Yes | Yes |
| Segmentation and reassembly                                      | Yes | Yes | Yes | Yes | Yes |
| Error recovery                                                   | No  | Yes | Yes | Yes | Yes |
| Reinitiate connectiona                                           | No  | Yes | No  | Yes | No  |
| Multiplexing / demultiplexing over single [virtual circuit][110] | No  | No  | Yes | Yes | Yes |
| Explicit flow control                                            | No  | No  | Yes | Yes | Yes |
| Retransmission on timeout                                        | No  | No  | No  | No  | Yes |
| Reliable transport service                                       | No  | Yes | No  | Yes | Yes |
| a If an excessive number of [PDUs][55] are unacknowledged.       |     |     |     |     |     |

An easy way to visualize the transport layer is to compare it with a post office, which deals with the dispatch and classification of mail and parcels sent. Do remember, however, that a post office manages the outer envelope of
mail. Higher layers may have the equivalent of double envelopes, such as cryptographic presentation services that can be read by the addressee only. Roughly speaking, [tunneling protocols][111] operate at the transport layer, such
as carrying non-IP protocols such as [IBM][112]'s [SNA][113] or [Novell][114]'s [IPX][115] over an IP network, or end-to-end encryption with [IPsec][43]. While [Generic Routing Encapsulation][116] (GRE) might seem to be a
network-layer protocol, if the encapsulation of the payload takes place only at endpoint, GRE becomes closer to a transport protocol that uses IP headers but contains complete frames or packets to deliver to an endpoint.
[L2TP][117] carries [PPP][49] frames inside transport packet.

Although not developed under the OSI Reference Model and not strictly conforming to the OSI definition of the transport layer, the [Transmission Control Protocol][33] (TCP) and the [User Datagram Protocol][34] (UDP) of the Internet
Protocol Suite are commonly categorized as layer-4 protocols within OSI.

### Layer 5: Session Layer 

The [session layer][25] controls the dialogues (connections) between computers. It establishes, manages and terminates the connections between the local and remote application. It provides for [full-duplex][119], [half-duplex][120],
    or [simplex][121] operation, and establishes checkpointing, adjournment, termination, and restart procedures. The OSI model made this layer responsible for graceful close of sessions, which is a property of the [Transmission
    Control Protocol][33], and also for session checkpointing and recovery, which is not usually used in the Internet Protocol Suite. The session layer is commonly implemented explicitly in application environments that use [remote
    procedure calls][122].

### Layer 6: Presentation Layer 

The [presentation layer][21] establishes context between application-layer entities, in which the application-layer entities may use different syntax and semantics if the presentation service provides
a big mapping between them. If a mapping is available, presentation service data units are encapsulated into session protocol data units, and passed down the protocol stack.

This layer provides independence from data representation (e.g., [encryption][24]) by translating between application and network formats. The presentation layer transforms data into the form
that the application accepts. This layer formats and encrypts data to be sent across a network. It is sometimes called the syntax layer.[7]

The original presentation structure used the [Basic Encoding Rules][124] of [Abstract Syntax Notation One][125] (ASN.1), with capabilities such as converting an [EBCDIC][126]-coded text
[file][127] to an [ASCII][128]-coded file, or [serialization][129] of [objects][130] and other [data structures][131] from and to [XML][132].

### Layer 7: Application Layer 

The [application layer][13] is the OSI layer closest to the end user, which means both the OSI application layer and the user interact directly with the software application.
This layer interacts with software applications that implement a communicating component. Such application programs fall outside the scope of the OSI model.
Application-layer functions typically include identifying communication partners, determining resource availability, and synchronizing communication.
When identifying communication partners, the application layer determines the identity and availability of communication partners for an application with data to transmit.
When determining resource availability, the application layer must decide whether sufficient network or the requested communication exists.
In synchronizing communication, all communication between applications requires cooperation that is managed by the application layer.

## Cross-layer functions 

There are some functions or services that are not tied to a given layer, but they can affect more than one layer. Examples include the following:

* [Security service (telecommunication)][58][4] as defined by [ITU-T][59] X.800 recommendation.
* Management functions, i.e. functions that permit to configure, instantiate, monitor, terminate the communications of two or more entities: there is a specific application-layer protocol,
    [common management information protocol][135] (CMIP) and its corresponding service, [common management information service][136] (CMIS), they need to interact with every layer in order to deal with their instances.
* [Multiprotocol Label Switching][137] (MPLS) operates at an OSI-model layer that is generally considered to lie between traditional definitions of layer 2 (data link layer) and layer 3 (network layer),
    and thus is often referred to as a "layer-2.5" protocol. It was designed to provide a unified data-carrying service for both circuit-based clients and packet-switching clients which provide a
    [datagram][37]-based service model. It can be used to carry many different kinds of traffic, including IP packets, as well as native ATM, SONET, and Ethernet frames.
* [ARP][138] is used to translate IPv4 addresses (OSI layer 3) into Ethernet MAC addresses (OSI layer 2).

## Interfaces 

Neither the OSI Reference Model nor OSI protocols specify any programming interfaces, other than deliberately abstract service specifications.
Protocol specifications precisely define the interfaces between different computers, but the software interfaces inside computers, known as [network sockets][140] are implementation-specific.

For example, [Microsoft Windows][141]' [Winsock][142], and [Unix][143]'s [Berkeley sockets][144] and [System V][145] [Transport Layer Interface][146], are 
nterfaces between applications (layer 5 and above) and the transport (layer 4). [NDIS][147] and [ODI][148] are interfaces between the media (layer 2) and the network protocol (layer 3).

Interface standards, except for the physical layer to media, are approximate implementations of OSI service specifications.

## Examples 

## Comparison with TCP/IP model 

The design of protocols in the [TCP/IP model][151] of the Internet does not concern itself with strict hierarchical encapsulation and layering.[13][RFC 3439][152] contains a section entitled
"Layering [considered harmful][153]".[14] TCP/IP does recognize four broad layers of functionality which are derived from the operating scope of their contained protocols: the scope
of the software application; the end-to-end transport connection; the internetworking range; and the scope of the direct links to other nodes on the local network.[15]

Despite using a different concept for layering than the OSI model, these layers are nevertheless often compared with the OSI layering scheme in the following way:

* The Internet [application layer][13] includes the OSI application layer, presentation layer, and most of the session layer.
* Its end-to-end [transport layer][29] includes the graceful close function of the OSI session layer as well as the OSI transport layer.
* The internetworking layer ([Internet layer][154]) is a subset of the OSI network layer.
* The [link layer][155] includes the OSI data link layer and sometimes the physical layers, as well as some protocols of the OSI's network layer.

These comparisons are based on the original seven-layer protocol model as defined in ISO 7498, rather than refinements in such things as the internal organization of the network layer document.[[_citation needed][8]_]

The presumably strict layering of the OSI model as it is usually described does not present contradictions in TCP/IP, as it is permissible that protocol usage does not follow
the hierarchy implied in a layered model. Such examples exist in some routing protocols (e.g., OSPF), or in the description of [tunneling protocols][111], which provide a
link layer for an application, although the tunnel host protocol might well be a transport or even an application-layer protocol in its own right.[[_citation needed][8]_]




[1]: /wiki/Conceptual_model "Conceptual model"
[2]: /wiki/Communication_system "Communication system"
[3]: /wiki/Abstraction_layer "Abstraction layer"
[4]: /wiki/Open_Systems_Interconnection "Open Systems Interconnection"
[5]: /wiki/International_Organization_for_Standardization "International Organization for Standardization"
[6]: https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/OSI-model-Communication.svg/400px-OSI-model-Communication.svg.png
[7]: /w/index.php?title=OSI_model&action=edit§ion=1 "Edit section: History"
[8]: /wiki/Wikipedia:Citation_needed "Wikipedia:Citation needed"
[9]: /wiki/Charles_Bachman "Charles Bachman"
[10]: /wiki/ARPANET "ARPANET"
[11]: /wiki/CYCLADES "CYCLADES"
[12]: /w/index.php?title=OSI_model&action=edit§ion=2 "Edit section: Description of OSI layers"
[13]: /wiki/Application_layer "Application layer"
[14]: /wiki/Data_(computing) "Data (computing)"
[15]: /wiki/API "API"
[16]: /wiki/Directory_service "Directory service"
[17]: /wiki/Virtual_terminal "Virtual terminal"
[18]: /wiki/HTTP "HTTP"
[19]: /wiki/FTP "FTP"
[20]: /wiki/SMTP "SMTP"
[21]: /wiki/Presentation_layer "Presentation layer"
[22]: /wiki/Character_encoding "Character encoding"
[23]: /wiki/Data_compression "Data compression"
[24]: /wiki/Encryption "Encryption"
[25]: /wiki/Session_layer "Session layer"
[26]: /wiki/Session_(computer_science) "Session (computer science)"
[27]: /wiki/Remote_Procedure_Call "Remote Procedure Call"
[28]: /wiki/Password_authentication_protocol "Password authentication protocol"
[29]: /wiki/Transport_layer "Transport layer"
[30]: /wiki/Packet_segmentation "Packet segmentation"
[31]: /wiki/Acknowledgement_(data_networks) "Acknowledgement (data networks)"
[32]: /wiki/Multiplexing "Multiplexing"
[33]: /wiki/Transmission_Control_Protocol "Transmission Control Protocol"
[34]: /wiki/User_Datagram_Protocol "User Datagram Protocol"
[35]: /wiki/Network_layer "Network layer"
[36]: /wiki/Network_packet "Network packet"
[37]: /wiki/Datagram "Datagram"
[38]: /wiki/Address_space "Address space"
[39]: /wiki/Routing "Routing"
[40]: /wiki/Network_traffic_control "Network traffic control"
[41]: /wiki/IPv4 "IPv4"
[42]: /wiki/IPv6 "IPv6"
[43]: /wiki/IPsec "IPsec"
[44]: /wiki/AppleTalk "AppleTalk"
[45]: /wiki/Internet_Control_Message_Protocol "Internet Control Message Protocol"
[46]: /wiki/Data_link_layer "Data link layer"
[47]: /wiki/Bit "Bit"
[48]: /wiki/Frame_(networking) "Frame (networking)"
[49]: /wiki/Point-to-Point_Protocol "Point-to-Point Protocol"
[50]: /wiki/IEEE_802.2 "IEEE 802.2"
[51]: /wiki/L2TP "L2TP"
[52]: /wiki/Physical_layer "Physical layer"
[53]: /wiki/DSL "DSL"
[54]: /wiki/USB "USB"
[55]: /wiki/Protocol_data_unit "Protocol data unit"
[56]: /wiki/Service_data_unit "Service data unit"
[57]: /wiki/Concatenation "Concatenation"
[58]: /wiki/Security_service_(telecommunication) "Security service (telecommunication)"
[59]: /wiki/ITU-T "ITU-T"
[60]: /wiki/Information_Security "Information Security"
[61]: /wiki/Confidentiality "Confidentiality"
[62]: /wiki/Integrity "Integrity"
[63]: /wiki/Availability "Availability"
[64]: /wiki/Network_design "Network design"
[65]: /wiki/Network_management "Network management"
[66]: /wiki/Denial_of_service "Denial of service"
[67]: /w/index.php?title=OSI_model&action=edit§ion=3 "Edit section: Layer 1: Physical Layer"
[68]: /wiki/Electrical "Electrical"
[69]: /wiki/Transmission_medium "Transmission medium"
[70]: /wiki/Optical_fiber_cable "Optical fiber cable"
[71]: /wiki/Lead_(electronics) "Lead (electronics)"
[72]: /wiki/Voltage "Voltage"
[73]: /wiki/Characteristic_impedance "Characteristic impedance"
[74]: /wiki/Cable "Cable"
[75]: /wiki/Specification "Specification"
[76]: /wiki/Network_hub "Network hub"
[77]: /wiki/Repeater "Repeater"
[78]: /wiki/Network_card "Network card"
[79]: /wiki/Host_adapter "Host adapter"
[80]: /wiki/Storage_area_network "Storage area network"
[81]: /wiki/Communication "Communication"
[82]: /wiki/Flow_control_(data) "Flow control (data)"
[83]: /wiki/Network_topology "Network topology"
[84]: /wiki/Bus_network "Bus network"
[85]: /wiki/Mesh_networking "Mesh networking"
[86]: /wiki/Ring_network "Ring network"
[87]: /wiki/Parallel_SCSI "Parallel SCSI"
[88]: /wiki/Ethernet "Ethernet"
[89]: /wiki/Token_Ring "Token Ring"
[90]: /wiki/Fiber_Distributed_Data_Interface "Fiber Distributed Data Interface"
[91]: /wiki/G.hn "G.hn"
[92]: /wiki/IEEE_802.11 "IEEE 802.11"
[93]: /wiki/Bluetooth "Bluetooth"
[94]: /wiki/IEEE_802.15.4 "IEEE 802.15.4"
[95]: /w/index.php?title=OSI_model&action=edit§ion=4 "Edit section: Layer 2: Data Link Layer"
[96]: /wiki/Node-to-node_data_transfer "Node-to-node data transfer"
[97]: /wiki/Reliability_(computer_networking) "Reliability (computer networking)"
[98]: /wiki/Media_Access_Control "Media Access Control"
[99]: /wiki/Logical_Link_Control "Logical Link Control"
[100]: /wiki/TCP/IP "TCP/IP"
[101]: /wiki/Error_correction "Error correction"
[102]: /wiki/Selective_repeat "Selective repeat"
[103]: /wiki/Sliding_window_protocol "Sliding window protocol"
[104]: /w/index.php?title=OSI_model&action=edit§ion=5 "Edit section: Layer 3: Network Layer"
[105]: /wiki/Data "Data"
[106]: /wiki/Datagrams "Datagrams"
[107]: /w/index.php?title=OSI_model&action=edit§ion=6 "Edit section: Layer 4: Transport Layer"
[108]: /wiki/Internet_Protocol "Internet Protocol"
[109]: /wiki/Communications_protocol "Communications protocol"
[110]: /wiki/Virtual_circuit "Virtual circuit"
[111]: /wiki/Tunneling_protocol "Tunneling protocol"
[112]: /wiki/IBM "IBM"
[113]: /wiki/IBM_Systems_Network_Architecture "IBM Systems Network Architecture"
[114]: /wiki/Novell "Novell"
[115]: /wiki/Internetwork_Packet_Exchange "Internetwork Packet Exchange"
[116]: /wiki/Generic_Routing_Encapsulation "Generic Routing Encapsulation"
[117]: /wiki/Layer_2_Tunneling_Protocol "Layer 2 Tunneling Protocol"
[118]: /w/index.php?title=OSI_model&action=edit§ion=7 "Edit section: Layer 5: Session Layer"
[119]: /wiki/Duplex_(telecommunications) "Duplex (telecommunications)"
[120]: /wiki/Half-duplex "Half-duplex"
[121]: /wiki/Simplex_communication "Simplex communication"
[122]: /wiki/Remote_procedure_call "Remote procedure call"
[123]: /w/index.php?title=OSI_model&action=edit§ion=8 "Edit section: Layer 6: Presentation Layer"
[124]: /wiki/Basic_Encoding_Rules "Basic Encoding Rules"
[125]: /wiki/Abstract_Syntax_Notation_One "Abstract Syntax Notation One"
[126]: /wiki/EBCDIC "EBCDIC"
[127]: /wiki/Computer_file "Computer file"
[128]: /wiki/ASCII "ASCII"
[129]: /wiki/Serialization "Serialization"
[130]: /wiki/Object_(computer_science) "Object (computer science)"
[131]: /wiki/Data_structure "Data structure"
[132]: /wiki/XML "XML"
[133]: /w/index.php?title=OSI_model&action=edit§ion=9 "Edit section: Layer 7: Application Layer"
[134]: /w/index.php?title=OSI_model&action=edit§ion=10 "Edit section: Cross-layer functions"
[135]: /wiki/Common_management_information_protocol "Common management information protocol"
[136]: /wiki/Common_management_information_service "Common management information service"
[137]: /wiki/Multiprotocol_Label_Switching "Multiprotocol Label Switching"
[138]: /wiki/Address_Resolution_Protocol "Address Resolution Protocol"
[139]: /w/index.php?title=OSI_model&action=edit§ion=11 "Edit section: Interfaces"
[140]: /wiki/Network_socket "Network socket"
[141]: /wiki/Microsoft_Windows "Microsoft Windows"
[142]: /wiki/Winsock "Winsock"
[143]: /wiki/Unix "Unix"
[144]: /wiki/Berkeley_sockets "Berkeley sockets"
[145]: /wiki/UNIX_System_V "UNIX System V"
[146]: /wiki/Transport_Layer_Interface "Transport Layer Interface"
[147]: /wiki/Network_Driver_Interface_Specification "Network Driver Interface Specification"
[148]: /wiki/Open_Data-Link_Interface "Open Data-Link Interface"
[149]: /w/index.php?title=OSI_model&action=edit§ion=12 "Edit section: Examples"
[150]: /w/index.php?title=OSI_model&action=edit§ion=13 "Edit section: Comparison with TCP/IP model"
[151]: /wiki/TCP/IP_model "TCP/IP model"
[152]: //tools.ietf.org/html/rfc3439
[153]: /wiki/Considered_harmful "Considered harmful"
[154]: /wiki/Internet_layer "Internet layer"
[155]: /wiki/Link_layer "Link layer"
[156]: /w/index.php?title=OSI_model&action=edit§ion=14 "Edit section: See also"
[157]: /w/index.php?title=OSI_model&action=edit§ion=15 "Edit section: References"
[158]: /w/index.php?title=OSI_model&action=edit§ion=16 "Edit section: External links"
[159]: https://upload.wikimedia.org/wikipedia/en/thumb/4/4a/Commons-logo.svg/30px-Commons-logo.svg.png
[160]: //commons.wikimedia.org/wiki/Category:OSI_model "commons:Category:OSI model"
  
