# meta-frits

A minimal Yocto layer for the **Walnascar** release (Yocto Project 5.0).  
This layer demonstrates how to install a simple file (`frits.txt`) into `/home/root/` in the final image.

## Features
- Compatible with Yocto **Walnascar**
- Demonstrates the new `S = "${UNPACKDIR}"` requirement
- Shows how to install a file into the root filesystem

## Usage

1. Clone this layer into your Yocto workspace.
2. Add it to your `bblayers.conf`:
   bitbake-layers add-layer meta-frits
3. Add the recipe to your image:
   IMAGE_INSTALL:append = " frits-file"

After building your image, the file will appear at:
`/home/root/frits.txt`

# Notes
- Although not verified, it seems to work for **Styhead** to.
- 'your image' might be in .../build/conf/local.conf, add the IMAGE_INSTALL line to this file.

## Cloning or adding by hand?
My advice is to add this layer by hand to get practice with this.
- Go the your build directory: happens automatically when executing `. ./oe-init-build-env`.
- Here create the layer with: `bitbake-layers create-layer meta-frits`.
- Then create the directory structure and add the files as found in this repo.

# Building and Running
- Build example: `bitbake core-image-minimal`
- Run example using qemu: `runqemu nographic`
