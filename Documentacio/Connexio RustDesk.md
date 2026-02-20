# Connexió amb IP sense servidor

- Habilitar accés directe IP (configuració)
- Establir contrasenya permanent
- Establir RustDesk per a que iniciï al principi:
    sudo systemctl enable rustdesk.service
- Pantalla dummy:
    - Instal·lar xorg:
        sudo apt install xserver-xorg-video-dummy
    - Crear arxiu de configuració:
        /etc/X11/xorg.conf.d/10-headless.conf
    - Afegir el següent a l'arxiu:
        Section "Monitor"
            Identifier "Monitor0"
            HorizSync 28.0-80.0
            VertRefresh 48.0-75.0
            Modeline "1920x1080" 148.50 1920 2008 2052 2200 1080 1084 1089 1125 +hsync +vsync
            Option "PreferredMode" "1920x1080"
        EndSection

        Section "Device"
            Identifier "Device0"
            Driver "dummy"
        EndSection

        Section "Screen"
            Identifier "Screen0"
            Device "Device0"
            Monitor "Monitor0"
            DefaultDepth 24
            SubSection "Display"
                Depth 24
                Modes "1920x1080"
            EndSubSection
        EndSection
    - Reiniciar
    - Anar a l'arxiu de configuració de gmd3 per poder iniciar sessió remotament:
        /etc/gdm3/custom.conf
    - Descomentar la línia següent:
        #WaylandEnable=false
    - IMPORTANT!!!!!
          - Si es vol connectar una pantalla externa per qualsevol error, s'ha de treure l'arxiu creat a /etc/X11/xorg.conf.d/{nom de l'arxiu} i reiniciar
    
