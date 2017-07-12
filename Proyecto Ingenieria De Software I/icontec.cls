% Autor Hector Florez

\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{icontec}[2014/08/25 v1.0]
\LoadClass[11pt,letterpaper]{report}

\RequirePackage[utf8]{inputenc}
\RequirePackage{graphicx}
\RequirePackage[spanish,es-tabla]{babel}
\RequirePackage[justification=centering]{caption}
\RequirePackage{longtable}
\RequirePackage{multirow}
\RequirePackage[plainpages=false]{hyperref}
\RequirePackage{fancyhdr}
\RequirePackage{lscape}

%----Margenes----
\setlength{\topmargin}{-0.65cm}
\setlength{\oddsidemargin}{0.5cm}
\setlength{\evensidemargin}{0.5cm}
\setlength{\textwidth}{17cm}
\setlength{\textheight}{22cm}
\setlength{\footskip}{1cm}
%----Margenes----

%----Portada y Contraportada----
\def\logo#1{\gdef\@logo{#1}}
\def\institution#1{\gdef\@institution{#1}}
\def\faculty#1{\gdef\@faculty{#1}}
\def\degree#1{\gdef\@degree{#1}}
\def\city#1{\gdef\@city{#1}}
\def\legend#1{\gdef\@legend{#1}}
\def\director#1{\gdef\@director{#1}}
\def\firstjudge#1{\gdef\@firstjudge{#1}}
\def\secondjudge#1{\gdef\@secondjudge{#1}}
\def\approbationcity#1{\gdef\@approbationcity{#1}}
\def\approbationdate#1{\gdef\@approbationdate{#1}}

\renewcommand\maketitle{
%----Portada----
\begin{titlepage}
    \begin{center}
        {\huge \bf \@title }
        \vfill
        \includegraphics[width=0.2\textwidth]{\@logo} \\
        \vfill
        {\large \bf \@author }%
        \vfill
        {\large \bf \@institution \\}
        {\large \bf \@degree \\}
        {\large \bf \@faculty \\}
        {\large \bf \@city \\}
        {\large \bf \@date}
    \end{center}
\end{titlepage}
%----Portada----

}%----Portada y Contraportada----

%----Espacios----
\setlength{\parskip}{1em}
\AtBeginDocument{\addtocontents{toc}{\protect\setlength{\parskip}{0pt}}}
\AtBeginDocument{\addtocontents{lof}{\protect\setlength{\parskip}{0pt}}}
\AtBeginDocument{\addtocontents{lot}{\protect\setlength{\parskip}{0pt}}}
%----Espacios----

%----Encabezado y Pie de Pagina----
\pagestyle{fancy}
\fancyhf{}
\fancyhead[R]{\itshape\nouppercase\leftmark}
\fancyfoot[C]{\thepage}
%----Encabezado y Pie de Pagina----

%----Tablas de Contenido----
\addto\captionsspanish{\renewcommand{\contentsname}{Tabla de Contenido}}
\addto\captionsspanish{\renewcommand{\listfigurename}{Lista de Figuras}}
\addto\captionsspanish{\renewcommand{\listtablename}{Lista de Tablas}}
%----Tablas de Contenido----
