package com.studyhub.sth.controllers;

import com.studyhub.sth.dtos.rooms.RoomAtualizadaDto;
import com.studyhub.sth.dtos.rooms.RoomDto;
import com.studyhub.sth.exceptions.ElementoNaoEncontradoExcecao;
import com.studyhub.sth.services.rooms.IRoomService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/rooms")
@Tag(name = "Rooms Controller")
public class RoomController {
    @Autowired
    private IRoomService roomService;

    @PostMapping()
    public ResponseEntity<RoomDto> criar(@RequestBody RoomDto novoRoomDto) {
        return new ResponseEntity<>(this.roomService.criar(novoRoomDto), HttpStatus.CREATED);
    }

    @PutMapping("{roomId}")
    public ResponseEntity<RoomDto> atualizar(@PathVariable UUID roomId, @RequestBody RoomAtualizadaDto roomAtualizadaDto) throws ElementoNaoEncontradoExcecao {
        return new ResponseEntity<>(this.roomService.atualizar(roomId, roomAtualizadaDto), HttpStatus.OK);
    }

    @GetMapping("{roomId}")
    public ResponseEntity<RoomDto> detalhar(@PathVariable UUID roomId) throws ElementoNaoEncontradoExcecao {
        return new ResponseEntity<>(this.roomService.detalhar(roomId), HttpStatus.OK);
    }
}
