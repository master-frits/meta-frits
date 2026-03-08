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
Although not verified, it seems to work for **Styhead** to.
