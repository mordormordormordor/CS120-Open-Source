def rgb_to_hex(r, g, b):
    #creates rgb values and then turns them into hexadecimal numbers
    r = max(0, min(255, r))
    g = max(0, min(255, g))
    b = max(0, min(255, b))
    #returns a hexadecimal string
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
