DESCRIPTION = "Install frits.txt into /home/root"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://frits.txt"

#S = "${WORKDIR}"
S = "${UNPACKDIR}"

inherit allarch

do_install() {
    install -d ${D}/home/root
    #install -m 0644 ${WORKDIR}/frits.txt ${D}/home/root/
    install -m 0644 ${S}/frits.txt ${D}/home/root/
}

FILES:${PN} += "/home/root/frits.txt"
