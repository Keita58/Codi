# Com afegir un disc extern a Linux

1. Amb la comanda *sudo blkid* agafem la UUID del disc nou
2. Anem al fitxer /etc/fstab i afegim la següent línia:
    · UUID={*UUID del disc que hem copiat abans*} {Direcció on volem que surtin les dades} ext4 defaults 0 2
    2.1. En el cas que el disc estigui formatejat amb NTFS i no es pugui formatejar podem escriure el següent:
        · UUID={UUID del disc} {Direcció} ntfs-3g defaults,nls=utf8,umask=000,dmask=027,fmask=137,uid=1000,gid=1000,windows_names 0 2
3. Després reiniciem els discs amb *systemctl daemon-reload*
4. I per acabar els muntem als paths que hem posat al fstab amb *sudo mount -a*
